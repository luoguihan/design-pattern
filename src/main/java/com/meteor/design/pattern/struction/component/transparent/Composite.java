package com.meteor.design.pattern.struction.component.transparent;

import java.util.ArrayList;

/**
 * @author: luoguihan
 * @date: 2019-02-27
 * @version: 1.0
 */
public class Composite extends Component {

    private ArrayList<Component> list = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return list.get(i);
    }

    @Override
    public void operation() {
        //容器构件具体业务方法的实现
        //递归调用成员构件的业务方法
        for(Component component:list) {
            component.operation();
        }
    }
}
