package com.meteor.design.pattern.creation.builder;

/**
 * 抽象建造者
 *
 * @author: luoguihan
 * @date: 2019/2/8
 * @version: 1.0
 */
public interface PersonBuilder {

    void buildHead();

    void buildBody();

    void buildFoot();

    Person buildPerson();
}
