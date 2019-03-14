package com.meteor.design.pattern.struction.component.transparent;

/**
 * @author: luoguihan
 * @date: 2019-02-27
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        Component root = new Composite("root");
        root.add(new LeafA("根下的第一片叶子A"));
        root.add(new LeafB("根下的第二片叶子B"));

        //分支
        Component branchA = new Composite("branch");
        Component branchB = new Composite("branch");
        root.add(branchA);
        root.add(branchB);

        branchA.add(new LeafA("branchA的第一片叶子A"));
        branchB.add(new LeafA("branchB的第一片叶子A"));

        root.operation();

        branchA.operation();
    }
}
