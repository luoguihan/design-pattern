package com.meteor.design.pattern.creation.factory.abstractFactory;

/**
 * 抽象工厂
 * @author: luoguihan
 * @date: 2019/1/27
 * @version: 1.0
 */
public abstract class CarFactory {

    /**
     * 创建经济型汽车
     * @return
     */
    public abstract Car createEconomicalCar();

    /**
     * 创建至尊型汽车
     * @return
     */
    public abstract Car createExtremeCar();
}
