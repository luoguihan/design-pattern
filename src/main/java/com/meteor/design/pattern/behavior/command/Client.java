package com.meteor.design.pattern.behavior.command;

/**
 * @author: luoguihan
 * @date 2019-03-19
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command concreteCommandA = new ConcreteCommandA(receiver);
        Command concreteCommandB = new ConcreteCommandB(receiver);

        Invoker invoker = new Invoker();
        invoker.setCommand(concreteCommandA);
        invoker.runCommand();

        invoker.setCommand(concreteCommandB);
        invoker.runCommand();
    }
}
