package com.meteor.design.pattern.behavior.memento;

import lombok.Data;

/**
 * 备忘录，负责存储Originator对象的内部状态
 *
 * @author: luoguihan
 * @date 2019-03-22
 * @version: 1.0
 */
@Data
public class RoleStateMemento {

    private int vit;

    private int atk;

    public RoleStateMemento(int vit, int atk){
        this.vit=vit;
        this.atk=atk;
    }
}
