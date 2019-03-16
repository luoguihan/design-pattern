package com.meteor.design.pattern.behavior.iterator.blackbox;

/**
 * @author: luoguihan
 * @date 2019-03-16
 * @version: 1.0
 */
public class ConcreteAggregate extends Aggregate {

    private Object[] objArray = null;

    /**
     * 构造方法，传入聚合对象的具体内容
     *
     * @param objArray
     */
    public ConcreteAggregate(Object[] objArray) {
        this.objArray = objArray;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator();
    }

    /**
     * 内部成员类，具体迭代子类
     * @author chenshuaishuai
     *
     */
    private class ConcreteIterator implements Iterator {
        /**
         * 内部索引，记录当前迭代到的索引位置
         */
        private int index = 0;
        /**
         * 记录当前聚集对象的大小
         */
        private int size = 0;
        /**
         * 构造函数，设置聚集对象大小和起始索引
         */
        public ConcreteIterator() {
            this.size = objArray.length;
            this.index = 0;
        }
        /**
         * 移动至第一个元素
         */
        @Override
        public void first() {
            this.index = 0;
        }

        /**
         * 迭代方法，移动到下一个元素
         */
        @Override
        public void next() {
            if (this.index < this.size) {
                this.index++;
            }
        }

        /**
         * 迭代方法，是否是最后一个元素
         */
        @Override
        public boolean isDone() {
            return (this.index >= this.size);
        }

        /**
         * 迭代方法，返还当前位置元素
         */
        @Override
        public Object currentItem() {
            return objArray[this.index];
        }

    }
}
