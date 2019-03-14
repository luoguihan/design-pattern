package com.meteor.design.pattern.creation.factory.simpleFactory;

/**
 * 具体产品
 *
 * @author: luoguihan
 * @date: 2019/1/27
 * @version: 1.0
 */
public class BMW extends Car {

    @Override
    public void drive() {
        System.out.println("BMW is driving");
    }
}
