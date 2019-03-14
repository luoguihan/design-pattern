package com.meteor.design.pattern.struction.component.transparent;

/**
 * @author: luoguihan
 * @date: 2019-02-27
 * @version: 1.0
 */
public class LeafB extends Component {

    public LeafB(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("Can not add a component");
    }

    @Override
    public void remove(Component component) {
        System.out.println("Can not remove a component");
    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("my name is " + name);
    }

}
