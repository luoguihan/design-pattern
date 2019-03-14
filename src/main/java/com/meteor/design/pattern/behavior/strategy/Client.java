package com.meteor.design.pattern.behavior.strategy;

/**
 * @author: luoguihan
 * @date 2019-03-13
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        Strategy strategyA = new ConcreteStrategyA();
        Context context = new Context(strategyA);
        context.contextInterface();
    }
}
