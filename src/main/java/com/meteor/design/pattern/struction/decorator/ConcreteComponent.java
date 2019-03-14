package com.meteor.design.pattern.struction.decorator;

/**
 * @author: luoguihan
 * @date: 2019/2/12
 * @version: 1.0
 */
public class ConcreteComponent implements Component {

    @Override
    public void doSomeThing() {
        System.out.println("doSomeThing");
    }
}
