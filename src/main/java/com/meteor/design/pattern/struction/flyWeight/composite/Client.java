package com.meteor.design.pattern.struction.flyWeight.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: luoguihan
 * @date: 2019-03-05
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        List<Character> compositeState = new ArrayList<Character>();
        compositeState.add('a');
        compositeState.add('b');
        compositeState.add('c');
        compositeState.add('a');
        compositeState.add('b');

        FlyWeightFactory factory = new FlyWeightFactory();
        FlyWeight flyWeight1 = factory.factory(compositeState);
        FlyWeight flyWeight2 = factory.factory(compositeState);
        flyWeight1.operation("composite");

        System.out.println("复合享元模式是否可以共享对象：" + (flyWeight1 == flyWeight2));

        Character state = 'a';
        FlyWeight fly1 = factory.factory(state);
        FlyWeight fly2 = factory.factory(state);
        System.out.println("单纯享元模式是否可以共享对象：" + (fly1 == fly2));
    }
}
