package com.meteor.design.pattern.creation.prototype.prototypeManager;

/**
 * @author: luoguihan
 * @date: 2019/2/11
 * @version: 1.0
 */
public interface OfficialDocument extends Cloneable{

    public OfficialDocument clone();

    public void display();
}
