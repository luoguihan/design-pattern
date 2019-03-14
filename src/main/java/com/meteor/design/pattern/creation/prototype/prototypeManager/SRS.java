package com.meteor.design.pattern.creation.prototype.prototypeManager;

/**
 * 软件需求规格说明书(Software Requirements Specification)类
 *
 * @author: luoguihan
 * @date: 2019/2/11
 * @version: 1.0
 */
public class SRS implements OfficialDocument{

    @Override
    public OfficialDocument clone() {
        OfficialDocument srs = null;
        try {
            srs = (OfficialDocument)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return srs;
    }

    @Override
    public void display() {
        System.out.println("《软件需求规格说明书》");
    }
}
