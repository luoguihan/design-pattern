package com.meteor.design.pattern.struction.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * @author: luoguihan
 * @date: 2019/2/15
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        /**
         * ClassLoader loader:指定当前目标对象使用的类加载器,获取加载器的方法是固定的
         * Class<?>[] interfaces:指定目标对象实现的接口的类型,使用泛型方式确认类型
         * InvocationHandler:指定动态处理器，执行目标对象的方法时,会触发事件处理器的方法
         */
        UserService proxyInstance = (UserService)Proxy.newProxyInstance(UserService.class.getClassLoader(), new Class[]{UserService.class}
                , new DynamicProxyHandler(userService));
        proxyInstance.save();
    }
}
