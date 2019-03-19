package com.meteor.design.pattern.behavior.command;

/**
 * @author: luoguihan
 * @date 2019-03-19
 * @version: 1.0
 */
public class ConcreteCommandA implements Command {

    private Receiver receiver;

    public ConcreteCommandA(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doSomeThingA();
    }
}
