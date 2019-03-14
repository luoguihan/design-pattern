package com.meteor.design.pattern.behavior.strategy;

/**
 * 策略模式上下文
 * @author: luoguihan
 * @date 2019-03-13
 * @version: 1.0
 */
public class Context {

    // 持有一个具体的策略对象
    private Strategy strategy;

    /**
     * 构造函数，传入一个具体策略对象
     * @param strategy    具体策略对象
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 策略方法
     */
    public void contextInterface(){
        strategy.algorithmInterface();
    }
}
