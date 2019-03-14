package com.meteor.design.pattern.struction.bridge;

/**
 * @author: luoguihan
 * @date: 2019/2/24
 * @version: 1.0
 */
public abstract class Shape {

    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
