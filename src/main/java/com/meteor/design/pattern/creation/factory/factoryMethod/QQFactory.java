package com.meteor.design.pattern.creation.factory.factoryMethod;

/**
 * @author: luoguihan
 * @date: 2019/1/27
 * @version: 1.0
 */
public class QQFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new QQ();
    }
}
