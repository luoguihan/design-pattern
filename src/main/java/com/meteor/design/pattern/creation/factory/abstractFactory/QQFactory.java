package com.meteor.design.pattern.creation.factory.abstractFactory;

/**
 * @author: luoguihan
 * @date: 2019/1/27
 * @version: 1.0
 */
public class QQFactory extends CarFactory {
    @Override
    public Car createEconomicalCar() {
        return new EconomicalQQ();
    }

    @Override
    public Car createExtremeCar() {
        return new ExtremeQQ();
    }
}
