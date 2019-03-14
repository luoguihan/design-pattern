package com.meteor.design.pattern.struction.proxy.staticProxy;

/**
 * @author: luoguihan
 * @date: 2019/2/12
 * @version: 1.0
 */
public class UserServiceImplProxy implements UserService {

    UserService userService;

    public UserServiceImplProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void save() {
        System.out.println("开始事务");
        userService.save();
        System.out.println("结束事务");
    }
}
