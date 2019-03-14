package com.meteor.design.pattern.struction.flyWeight.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂角色类
 *
 * @author: luoguihan
 * @date: 2019-03-05
 * @version: 1.0
 */
public class FlyWeightFactory {

    private Map<Character, FlyWeight> map = new HashMap<>();

    public FlyWeight factory(Character state) {
        FlyWeight flyWeight = map.get(state);
        if (null == flyWeight){
            flyWeight = new ConcreteFlyWeight(state);
            map.put(state, flyWeight);
        }
        return flyWeight;
    }
}
