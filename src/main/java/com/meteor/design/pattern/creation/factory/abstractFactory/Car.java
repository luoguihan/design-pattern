package com.meteor.design.pattern.creation.factory.abstractFactory;

import lombok.Data;

/**
 * 抽象产品
 *
 * @author: luoguihan
 * @date: 2019/1/27
 * @version: 1.0
 */
@Data
public abstract class Car {

    private String name;

    public abstract void drive();
}
