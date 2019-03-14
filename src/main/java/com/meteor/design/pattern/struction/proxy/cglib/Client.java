package com.meteor.design.pattern.struction.proxy.cglib;

/**
 * @author: luoguihan
 * @date: 2019/2/18
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        UserService userService = new UserService();
        ProxyFactory proxyFactory = new ProxyFactory(userService);
        UserService proxyInstance = (UserService)proxyFactory.getProxyInstance();
        proxyInstance.save();
    }
}
