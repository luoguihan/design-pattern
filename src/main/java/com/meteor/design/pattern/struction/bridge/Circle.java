package com.meteor.design.pattern.struction.bridge;

/**
 * @author: luoguihan
 * @date: 2019/2/24
 * @version: 1.0
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        color.bepaint("圆形");
    }
}
