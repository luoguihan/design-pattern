package com.meteor.design.pattern.struction.adapter.classAdapter;

/**
 * @author: luoguihan
 * @date: 2019/2/11
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 类适配器模式
        PowerAdapter powerAdapter = new PowerAdapter();
        powerAdapter.output5V();
    }
}
