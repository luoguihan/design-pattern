package com.meteor.design.pattern.creation.prototype.prototypeManager;

/**
 * 可行性分析报告(Feasibility Analysis Report)类
 *
 * @author: luoguihan
 * @date: 2019/2/11
 * @version: 1.0
 */
public class FAR implements OfficialDocument {

    @Override
    public OfficialDocument clone() {
        OfficialDocument far = null;
        try {
            far = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return far;
    }

    @Override
    public void display() {
        System.out.println("《可行性分析报告》");
    }
}
