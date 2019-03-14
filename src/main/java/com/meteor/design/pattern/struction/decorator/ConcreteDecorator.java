package com.meteor.design.pattern.struction.decorator;

/**
 * @author: luoguihan
 * @date: 2019/2/12
 * @version: 1.0
 */
public class ConcreteDecorator extends Decorator{

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void doSomeThing() {
        System.out.println("prepare to doSomeThing");
        component.doSomeThing();
    }
}
