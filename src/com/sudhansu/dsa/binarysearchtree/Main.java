package com.sudhansu.dsa.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        System.out.println("Constructor");
        BinarySearchTree bst1 = new BinarySearchTree();
        System.out.println("Root: "+bst1.root);

        System.out.println("Insert");
        BinarySearchTree bst2 = new BinarySearchTree();
        bst2.insert(47);
        bst2.insert(21);
        bst2.insert(76);
        bst2.insert(18);
        bst2.insert(52);
        bst2.insert(82);

        bst2.insert(27);
        System.out.println(bst2.root.left.right.value);

        System.out.println("Contains");
        System.out.println(bst2.contains(27));
        System.out.println(bst2.contains(17));

    }
}
