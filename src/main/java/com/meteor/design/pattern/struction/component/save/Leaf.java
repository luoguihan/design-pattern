package com.meteor.design.pattern.struction.component.save;


/**
 * @author: luoguihan
 * @date: 2019-02-27
 * @version: 1.0
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println("my name is " + name);
    }

}
