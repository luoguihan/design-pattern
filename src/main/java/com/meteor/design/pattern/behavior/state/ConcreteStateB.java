package com.meteor.design.pattern.behavior.state;

/**
 * @author: luoguihan
 * @date 2019-03-25
 * @version: 1.0
 */
public class ConcreteStateB extends State {
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态为B");
        context.setState(new ConcreteStateA());
    }
}
