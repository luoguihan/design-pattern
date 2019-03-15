package com.meteor.design.pattern.behavior.observer;

/**
 * @author: luoguihan
 * @date 2019-03-15
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        WechatServer server = new WechatServer();
        Observer zhangsan = new User("zhangsan");
        Observer lisi = new User("lisi");
        Observer wangwu = new User("wangwu");

        server.registerObserver(zhangsan);
        server.registerObserver(lisi);
        server.registerObserver(wangwu);
        server.setMsg("PHP是最好的语言");

        server.removeObserver(zhangsan);
        server.setMsg("JAVA是最好的语言");
    }
}
