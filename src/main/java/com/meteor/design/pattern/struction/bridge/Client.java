package com.meteor.design.pattern.struction.bridge;

/**
 * @author: luoguihan
 * @date: 2019/2/24
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        Color white = new White();
        Shape circle = new Circle();

        circle.setColor(white);
        circle.draw();

        Shape rectange = new Rectangle();
        rectange.setColor(white);
        rectange.draw();
    }
}
