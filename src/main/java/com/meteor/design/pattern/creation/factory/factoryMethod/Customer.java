package com.meteor.design.pattern.creation.factory.factoryMethod;

/**
 * 调用者
 *
 * @author: luoguihan
 * @date: 2019/1/27
 * @version: 1.0
 */
public class Customer {

    public static void main(String[] args) {
        CarFactory factory = new BMWFactory();
        Car car = factory.createCar();
        car.drive();
    }
}
