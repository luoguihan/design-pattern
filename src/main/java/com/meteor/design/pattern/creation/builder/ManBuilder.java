package com.meteor.design.pattern.creation.builder;

/**
 * 具体建造者
 *
 * @author: luoguihan
 * @date: 2019/2/8
 * @version: 1.0
 */
public class ManBuilder implements PersonBuilder {

    Person person;

    public ManBuilder() {
        person = new Man();
    }

    @Override
    public void buildHead() {
        person.setBody("建造男人头部部分");
    }

    @Override
    public void buildBody() {
        person.setFoot("建造男人身体部分");
    }

    @Override
    public void buildFoot() {
        person.setHead("建造男人四肢部分");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
