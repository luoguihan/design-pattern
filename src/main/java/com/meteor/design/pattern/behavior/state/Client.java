package com.meteor.design.pattern.behavior.state;

/**
 * @author: luoguihan
 * @date 2019-03-25
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        Context context=new Context();
        context.Handle();
        context.Handle();
        context.Handle();
        context.Handle();
    }
}
