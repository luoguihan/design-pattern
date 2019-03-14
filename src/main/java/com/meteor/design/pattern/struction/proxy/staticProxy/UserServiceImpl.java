package com.meteor.design.pattern.struction.proxy.staticProxy;

/**
 * @author: luoguihan
 * @date: 2019/2/12
 * @version: 1.0
 */
public class UserServiceImpl implements UserService {
    @Override
    public void save() {
        System.out.println("save user");
    }
}
