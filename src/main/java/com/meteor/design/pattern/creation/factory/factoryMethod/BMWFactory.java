package com.meteor.design.pattern.creation.factory.factoryMethod;

/**
 * 具体的工厂
 *
 * @author: luoguihan
 * @date: 2019/1/27
 * @version: 1.0
 */
public class BMWFactory extends CarFactory {

    @Override
    public Car createCar() {
        return new BMW();
    }
}
