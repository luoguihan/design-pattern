package com.meteor.design.pattern.struction.flyWeight.composite;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: luoguihan
 * @date: 2019-03-05
 * @version: 1.0
 */
public class FlyWeightFactory {

    private Map<Character, FlyWeight> map = new HashMap<Character, FlyWeight>();

    /**
     * 单纯享元工厂方法
     *
     * @param state
     * @return
     */
    public FlyWeight factory(Character state) {
        FlyWeight flyWeight = map.get(state);
        if (null == flyWeight) {
            flyWeight = new ConcreteFlyWeight(state);
            map.put(state, flyWeight);
        }
        return flyWeight;
    }

    public FlyWeight factory(List<Character> compositeState) {
        ConcreteCompositeFlyWeight weight = new ConcreteCompositeFlyWeight();
        for (Character state : compositeState) {
            weight.add(state, this.factory(state));
        }
        return weight;
    }
}
