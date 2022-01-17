package com.marinagaisina;
// [25,20,15,27,30,29,26]

public class Main {

    public static void main(String[] args) {
	    Tree intTree = new Tree();
	    intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(33);

        intTree.traverseInOrder();
        System.out.println();
        System.out.println(intTree.get(27));
        System.out.println(intTree.get(888));
        System.out.println(intTree.max());
        System.out.println(intTree.min());
    }
}
