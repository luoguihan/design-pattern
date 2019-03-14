package com.meteor.design.pattern.behavior.templateMethod;

/**
 * @author: luoguihan
 * @date 2019-03-14
 * @version: 1.0
 */
public class ConcreteClassA extends AbstractClass{
    @Override
    protected void privateMethod() {
        System.out.println("A私有的方法");
    }

    public void hookMethod() {
        System.out.println("A的钩子方法");
    }
}
