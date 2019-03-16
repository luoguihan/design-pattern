package com.meteor.design.pattern.behavior.iterator.whitebox;

/**
 * @author: luoguihan
 * @date 2019-03-16
 * @version: 1.0
 */
public interface Iterator {

    /**
     * 迭代方法，移动至第一个元素
     */
    public void first();
    /**
     * 迭代方法，移动至下一个元素
     */
    public void next();
    /**
     * 迭代方法，是否为最后一个元素
     */
    public boolean isDone();
    /**
     * 迭代方法，返回当前元素
     */
    public Object currentItem();
}
