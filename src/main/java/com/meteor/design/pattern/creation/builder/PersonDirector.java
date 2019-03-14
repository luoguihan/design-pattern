package com.meteor.design.pattern.creation.builder;

/**
 * 指挥者，传入具体的建造者，并自定义建造顺序
 *
 * @author: luoguihan
 * @date: 2019/2/8
 * @version: 1.0
 */
public class PersonDirector {

    public Person constructPerson(PersonBuilder pb) {
        // 按照头部-身体-四肢的顺序创建人物
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }
}
