package com.meteor.design.pattern.creation.factory.simpleFactory;

/**
 * 调用者
 * @author: luoguihan
 * @date: 2019/1/27
 * @version: 1.0
 */
public class Customer {

    public static void main(String[] args) {
        Car bmw = CarFactory.getCar("BMW");
        bmw.drive();
    }
}
