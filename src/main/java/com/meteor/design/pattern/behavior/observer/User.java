package com.meteor.design.pattern.behavior.observer;

/**
 * 具体观察者
 * @author: luoguihan
 * @date 2019-03-15
 * @version: 1.0
 */
public class User implements Observer {

    private String name;

    private String msg;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        this.msg = msg;
        read();
    }

    public void read() {
        System.out.println(name + "收到推送消息：" + msg);
    }
}
