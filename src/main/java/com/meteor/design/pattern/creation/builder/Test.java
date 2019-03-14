package com.meteor.design.pattern.creation.builder;

/**
 * @author: luoguihan
 * @date: 2019/2/8
 * @version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        PersonDirector personDirector = new PersonDirector();
        Person man = personDirector.constructPerson(new ManBuilder());
        System.out.println(man.getHead());

        Person person = personDirector.constructPerson(new WomenBuilder());
        System.out.println(person.getHead());
    }
}
