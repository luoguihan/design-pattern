package com.meteor.design.pattern.behavior.iterator.blackbox;

/**
 * @author: luoguihan
 * @date 2019-03-16
 * @version: 1.0
 */
public class Client {
    public void operation() {
        Object[] objArray = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eigth" };
        Aggregate agg = new ConcreteAggregate(objArray);
        Iterator iterator = agg.createIterator();
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.operation();
    }
}
