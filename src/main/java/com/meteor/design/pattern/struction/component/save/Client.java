package com.meteor.design.pattern.struction.component.save;


/**
 * @author: luoguihan
 * @date: 2019-02-27
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("根下的第一片叶子"));
        root.add(new Leaf("根下的第二片叶子"));

        //分支
        Composite branchA = new Composite("branch");
        Composite branchB = new Composite("branch");
        root.add(branchA);
        root.add(branchB);

        branchA.add(new Leaf("branchA的第一片叶子"));
        branchB.add(new Leaf("branchB的第一片叶子"));

        root.operation();

        branchA.operation();
    }
}
