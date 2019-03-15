package com.meteor.design.pattern.behavior.observer;

/**
 * 抽象被观察者接口
 * 声明了添加、删除、通知观察者方法
 *
 * @author: luoguihan
 * @date 2019-03-15
 * @version: 1.0
 */
public interface Observerable {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObserver();
}
