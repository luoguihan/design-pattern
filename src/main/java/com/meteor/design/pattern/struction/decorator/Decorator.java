package com.meteor.design.pattern.struction.decorator;

/**
 * @author: luoguihan
 * @date: 2019/2/12
 * @version: 1.0
 */
public class Decorator implements Component {

    public Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void doSomeThing() {
        component.doSomeThing();
    }
}
