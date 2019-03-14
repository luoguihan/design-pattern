package com.meteor.design.pattern.struction.flyWeight.simple;

/**
 * @author: luoguihan
 * @date: 2019-03-05
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        FlyWeightFactory factory = new FlyWeightFactory();
        FlyWeight flyWeight = factory.factory(new Character('a'));
        flyWeight.operation("first");

        flyWeight = factory.factory(new Character('b'));
        flyWeight.operation("second");

        flyWeight = factory.factory(new Character('a'));
        flyWeight.operation("third");
    }
}
