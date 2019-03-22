package com.meteor.design.pattern.behavior.memento;

import lombok.Data;

/**
 * 游戏角色，相当于Originator
 *
 * @author: luoguihan
 * @date 2019-03-22
 * @version: 1.0
 */
@Data
public class GameRole {

    private int vit;
    private int atk;

    public void init() {
        vit=100;
        atk=100;
    }

    public void show(){
        System.out.println("体力:"+vit);
        System.out.println("攻击力:"+atk);
    }

    public void fightBoss(){
        this.vit=0;
        this.atk=0;
    }

    public RoleStateMemento saveMemento() {
        return new RoleStateMemento(vit, atk);
    }

    public void recove(RoleStateMemento roleStateMemento){
        this.vit=roleStateMemento.getVit();
        this.atk=roleStateMemento.getAtk();
    }
}
