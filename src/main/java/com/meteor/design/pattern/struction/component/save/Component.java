package com.meteor.design.pattern.struction.component.save;

/**
 * 安全式组合模式
 * @author: luoguihan
 * @date: 2019-02-27
 * @version: 1.0
 */
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void operation();
}
