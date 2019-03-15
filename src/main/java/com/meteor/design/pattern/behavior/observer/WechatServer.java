package com.meteor.design.pattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体被观察者
 * @author: luoguihan
 * @date 2019-03-15
 * @version: 1.0
 */
public class WechatServer implements Observerable {

    // 保存观察者列表
    private List<Observer> list;

    private String msg;

    public WechatServer() {
        list = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (null != list) {
            list.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < list.size(); i++) {
            Observer observer = list.get(i);
            observer.update(msg);
        }
    }

    public void setMsg(String msg) {
        this.msg = msg;
        System.out.println("服务更新消息：" + msg);
        // 消息更新，通知所有观察者
        notifyObserver();
    }
}
