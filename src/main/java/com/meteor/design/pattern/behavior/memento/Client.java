package com.meteor.design.pattern.behavior.memento;

/**
 * @author: luoguihan
 * @date 2019-03-22
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        GameRole link = new GameRole();
        link.init();
        System.out.println("初始化角色");
        link.show();
        RoleStateMange mange = new RoleStateMange();
        mange.setMemento(1, link.saveMemento());

        link.setVit(99);
        link.setAtk(98);
        System.out.println("角色路途上损失了生命值，在boss前保存进度");
        link.show();
        mange.setMemento(2, link.saveMemento());

        link.fightBoss();
        System.out.println("对战boss后的角色情况");
        link.show();

        link.recove(mange.getMemento(2));
        System.out.println("打开第二个记录,重新打boss");
        link.show();

        link.recove(mange.getMemento(1));
        System.out.println("打开第一个记录,重新开始");
        link.show();
    }
}
