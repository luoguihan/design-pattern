package com.meteor.design.pattern.creation.factory.simpleFactory;

/**
 * 简单工厂
 *
 * @author: luoguihan
 * @date: 2019/1/27
 * @version: 1.0
 */
public class CarFactory {

    public static Car getCar(String carName) {
        if ("BMW".equals(carName)) {
            return new BMW();
        }
        if ("QQ".equals(carName)) {
            return new QQ();
        }
        return null;
    }
}
