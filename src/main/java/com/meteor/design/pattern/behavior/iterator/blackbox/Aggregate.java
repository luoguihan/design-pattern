package com.meteor.design.pattern.behavior.iterator.blackbox;

/**
 * @author: luoguihan
 * @date 2019-03-16
 * @version: 1.0
 */
public abstract class Aggregate {
    /**
     * 工厂方法，创建相应迭代子对象的接口
     * @return
     */
    public abstract Iterator createIterator();
}
