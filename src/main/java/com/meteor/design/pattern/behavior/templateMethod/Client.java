package com.meteor.design.pattern.behavior.templateMethod;

/**
 * @author: luoguihan
 * @date 2019-03-14
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        AbstractClass classA =new ConcreteClassA();
        classA.templateMethod();

        AbstractClass classB =new ConcreteClassB();
        classB.templateMethod();
    }
}
