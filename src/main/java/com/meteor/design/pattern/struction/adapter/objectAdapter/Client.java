package com.meteor.design.pattern.struction.adapter.objectAdapter;

/**
 * @author: luoguihan
 * @date: 2019/2/11
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 对象适配器模式
        PowerAdapter powerAdapter = new PowerAdapter(new AC220());
        powerAdapter.output5V();
    }
}
