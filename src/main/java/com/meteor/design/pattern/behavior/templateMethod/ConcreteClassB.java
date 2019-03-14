package com.meteor.design.pattern.behavior.templateMethod;

/**
 * @author: luoguihan
 * @date 2019-03-14
 * @version: 1.0
 */
public class ConcreteClassB extends AbstractClass {
    @Override
    protected void privateMethod() {
        System.out.println("B私有的方法");
    }

    protected boolean isRun() {
        return false;
    }
}
