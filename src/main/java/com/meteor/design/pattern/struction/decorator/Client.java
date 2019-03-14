package com.meteor.design.pattern.struction.decorator;

/**
 * @author: luoguihan
 * @date: 2019/2/12
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteDecorator(new ConcreteComponent());
        component.doSomeThing();
    }
}
