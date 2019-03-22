package com.meteor.design.pattern.behavior.memento;

import java.util.HashMap;
import java.util.Map;

/**
 * 存档管理器，相当于Caretaker
 *
 * @author: luoguihan
 * @date 2019-03-22
 * @version: 1.0
 */
public class RoleStateMange {

    // 用户管理多个存档
    private Map map = new HashMap<Integer, RoleStateMemento>(99);

    public RoleStateMemento getMemento(Integer i) {
        return (RoleStateMemento)map.get(i);
    }

    public void setMemento(Integer i, RoleStateMemento memento) {
        map.put(i, memento);
    }
}
