package com.sudhansu.dsa.stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Constructor");
        Stack stack1 = new Stack(4);
        stack1.getTop();
        stack1.getHeight();
        stack1.printStack();

        System.out.println("Push");
        Stack stack2 = new Stack(2);
        stack2.push(1);
        stack2.printStack();

        System.out.println("Pop");
        Stack stack3 = new Stack(10);
        stack3.push(20);
        stack3.push(30);
        stack3.push(40);
        stack3.pop();
        stack3.printStack();
    }
}
