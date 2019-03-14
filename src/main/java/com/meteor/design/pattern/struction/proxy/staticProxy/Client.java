package com.meteor.design.pattern.struction.proxy.staticProxy;

/**
 * 静态代理
 * 优点：可以做到在符合开闭原则的情况下对目标对象进行功能扩展。
 * 缺点：我们得为每一个服务都得创建代理类，工作量太大，不易管理。同时接口一旦发生改变，代理类也得相应修改。
 * @author: luoguihan
 * @date: 2019/2/12
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        UserService userService = new UserServiceImplProxy(userServiceImpl);
        userService.save();
    }
}
