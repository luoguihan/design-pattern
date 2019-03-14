package com.meteor.design.pattern.struction.bridge;

/**
 * @author: luoguihan
 * @date: 2019/2/24
 * @version: 1.0
 */
public class White implements Color {
    @Override
    public void bepaint(String shape) {
        System.out.println("白色的" + shape);
    }
}
