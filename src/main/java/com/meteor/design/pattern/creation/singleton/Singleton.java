package com.meteor.design.pattern.creation.singleton;

/**
 * 单例模式
 *
 * @author: luoguihan
 * @date: 2019/1/27
 * @version: 1.0
 */
public class Singleton {

    /**
     * 饿汉模式（静态常量）
     * 优点：在类装载的时候就完成实例化，避免线程同步问题
     * 缺点：如果没有用到这个实例，会造成内存浪费
     */
   /* private static final Singleton INSTANCE = new Singleton();
    public static Singleton getInstance() {
        return INSTANCE;
    } */

    /**
     * 饿汉模式（静态代码块）
     */
    /*private static Singleton instance;
    static {
        instance = new Singleton();
    }
    public static Singleton getInstance() {
        return instance;
    } */

    /**
     * 懒汉模式(线程不安全),只能在单线程使用
     */
    /*public static Singleton singleton;
    public static Singleton getInstance() {
        if (null == singleton) {
            singleton = new Singleton();
        }
        return  singleton;
    }*/

    /**
     * 懒汉式(线程安全，同步方法),解决线程不安全问题，但每次想要获得实例都要进行同步，效率低
     */
    /*public static Singleton singleton;
    public static synchronized Singleton getInstance() {
        if (null == singleton) {
            singleton = new Singleton();
        }
        return  singleton;
    }*/

    /**
     * 懒汉式(线程不安全，同步代码块)，如果两个线程都通过if判断会造成多个实例
     */
    /*public static Singleton singleton;
    public static Singleton getInstance() {
        if (null == singleton) {
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }*/

    /**
     * 双重检查（线程安全，延迟加载）,在静态变量前加上volatile字段保证变量可见，
     * 同步时再判断变量是否为空，保证了只生成一个实例
     *
     */
    /*public static volatile Singleton singleton;
    public static Singleton getInstance() {
        if (null == singleton) {
            synchronized (Singleton.class) {
                if (null == singleton) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }*/

    /**
     * 静态内部类,与饿汉式一样采用类加载得机制保证初始化实例时只有一个线程，不同的是饿汉式只要Singleton被加载就会实例化，
     * 而静态内部类是在调用方法时加载SingletonInstance类才完成Singleton的实例化
     */
    /*public static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }*/
}

/**
 * 枚举
 */
/*
public enum Singleton {
    INSTANCE;
    public void doSomeThing() {
        System.out.println("doSomeThing");
    }
}*/