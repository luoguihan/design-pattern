package com.meteor.design.pattern.behavior.strategy;

/**
 * 具体策略类
 * @author: luoguihan
 * @date 2019-03-13
 * @version: 1.0
 */
public class ConcreteStrategyA implements Strategy {

    @Override
    public void algorithmInterface() {
        System.out.println("策略A");
    }
}
