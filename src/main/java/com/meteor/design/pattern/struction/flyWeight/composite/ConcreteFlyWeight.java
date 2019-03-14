package com.meteor.design.pattern.struction.flyWeight.composite;

/**
 * @author: luoguihan
 * @date: 2019-03-05
 * @version: 1.0
 */
public class ConcreteFlyWeight implements FlyWeight {
    private Character intrinsicState = null;

    public ConcreteFlyWeight(Character state) {
        this.intrinsicState = state;
    }

    @Override
    public void operation(String state) {
        System.out.println("intrinsicState = " + intrinsicState);
        System.out.println("extrinsicState = " + state);
    }
}
