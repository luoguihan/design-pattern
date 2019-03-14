package com.meteor.design.pattern.struction.component.transparent;

/**
 * 透明式的组合模式
 *
 * @author: luoguihan
 * @date: 2019-02-27
 * @version: 1.0
 */
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract Component getChild(int i);

    /**
     * 叶子具体实现
     */
    public abstract void operation();
}
