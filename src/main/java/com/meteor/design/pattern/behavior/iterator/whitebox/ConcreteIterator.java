package com.meteor.design.pattern.behavior.iterator.whitebox;

/**
 * @author: luoguihan
 * @date 2019-03-16
 * @version: 1.0
 */
public class ConcreteIterator implements Iterator {
    /**
     * 持有被迭代的具体的聚合对象
     */
    private ConcreteAggregate agg;
    /**
     * 内部索引，记录当前迭代到的索引位置
     */
    private int index = 0;
    /**
     * 记录当前索引对象的大小
     */
    private int size = 0;

    /**
     * 构造函数，传入具体的聚合对象，并获取聚合对象大小
     * @param agg
     */
    public ConcreteIterator(ConcreteAggregate agg) {
        this.agg = agg;
        this.size = agg.size();
        this.index = 0;
    }
    /**
     * 移动至第一个元素
     */
    public void first() {
        this.index = 0;
    }

    /**
     * 迭代方法，移动到下一个元素
     */
    public void next() {
        if (this.index < this.size) {
            this.index++;
        }
    }

    /**
     * 迭代方法，是否是最后一个元素
     */
    public boolean isDone() {
        return (this.index >= this.size);
    }

    /**
     * 迭代方法，返还当前位置元素
     */
    public Object currentItem() {
        return this.agg.getElement(this.index);
    }
}
