package com.meteor.design.pattern.struction.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态处理器
 * @author: luoguihan
 * @date: 2019/2/12
 * @version: 1.0
 */
public class DynamicProxyHandler implements InvocationHandler {

    private UserService userService;

    public DynamicProxyHandler(UserService userService) {
        this.userService = userService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始事务");
        Object result = method.invoke(userService, args);
        System.out.println("结束事务");
        return result;

    }
}
