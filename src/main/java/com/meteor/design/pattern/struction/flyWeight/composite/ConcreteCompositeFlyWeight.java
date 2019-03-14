package com.meteor.design.pattern.struction.flyWeight.composite;

import java.util.HashMap;
import java.util.Map;

/**
 * 复合享元角色类
 *
 * @author: luoguihan
 * @date: 2019-03-05
 * @version: 1.0
 */
public class ConcreteCompositeFlyWeight implements FlyWeight {

    private Map<Character, FlyWeight> map = new HashMap<Character, FlyWeight>();

    public void add(Character key, FlyWeight flyWeight) {
        map.put(key, flyWeight);
    }

    @Override
    public void operation(String state) {
        FlyWeight flyWeight = null;
        for (Object o : map.keySet()) {
            flyWeight = map.get(o);
            flyWeight.operation(state);
        }
    }
}
