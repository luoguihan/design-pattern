package com.meteor.design.pattern.behavior.templateMethod;

/**
 * 模板方法
 *
 * @author: luoguihan
 * @date 2019-03-14
 * @version: 1.0
 */
public abstract class AbstractClass {

    // 模板方法
    public void templateMethod() {
        publicMethod();
        privateMethod();
        // 子类可重写方法判断是否运行钩子方法
        if (isRun()) {
            hookMethod();
        }
    }


    // 通用重复的代码
    public void publicMethod() {
        System.out.println("运行每个类都一样的模板方法");
    }

    // 每个实现类实现的方法
    protected abstract void privateMethod();

    // 钩子方法,子类可复写状态判断是否执行
    public void hookMethod() {
        System.out.println("钩子方法");
    }

    protected boolean isRun() {
        return true;
    }
}
