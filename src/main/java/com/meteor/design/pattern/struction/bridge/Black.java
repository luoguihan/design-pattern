package com.meteor.design.pattern.struction.bridge;

/**
 * @author: luoguihan
 * @date: 2019/2/24
 * @version: 1.0
 */
public class Black implements Color {
    @Override
    public void bepaint(String shape) {
        System.out.println("黑色的" + shape);
    }
}
