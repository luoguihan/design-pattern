package com.meteor.design.pattern.struction.facade;

/**
 * @author: luoguihan
 * @date: 2019/2/24
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        computer.stop();
    }
}
