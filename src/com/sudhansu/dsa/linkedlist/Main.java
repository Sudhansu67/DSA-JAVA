package com.sudhansu.dsa.linkedlist;

public class Main {
    public static void main(String[] args) {

        System.out.println("Constructor");
        LinkedList linkedList = new LinkedList(3);
        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();
        linkedList.printList();

        System.out.println("Append");
        LinkedList linkedList1 = new LinkedList(4);
        linkedList1.append(5);
        linkedList1.append(6);
        linkedList1.printList();

        System.out.println("Remove Last");
        LinkedList linkedList2 = new LinkedList(4);
        linkedList2.append(5);
        System.out.println(linkedList2.removeLast().value);
        System.out.println(linkedList2.removeLast().value);
        System.out.println(linkedList2.removeLast());

        System.out.println("Prepend");
        LinkedList linkedList3 = new LinkedList(2);
        linkedList3.append(3);
        linkedList3.prepend(1);
        linkedList3.printList();

        System.out.println("Remove First");
        LinkedList linkedList4 = new LinkedList(2);
        linkedList4.append(1);
        System.out.println(linkedList4.removeFirst().value);
        System.out.println(linkedList4.removeFirst().value);
        System.out.println(linkedList4.removeLast());

        System.out.println("Get");
        LinkedList linkedList5 = new LinkedList(0);
        linkedList5.append(1);
        linkedList5.append(2);
        linkedList5.append(3);
        linkedList5.printList();
        System.out.println("Index 2 value: "+linkedList5.get(2).value);

        System.out.println("Set");
        LinkedList linkedList6 = new LinkedList(10);
        linkedList6.append(15);
        linkedList6.append(20);
        linkedList6.append(25);
        linkedList6.set(1, 17);
        linkedList6.printList();

        System.out.println("Insert");
        LinkedList linkedList7 = new LinkedList(0);
        linkedList7.append(2);
        linkedList7.insert(1, 1);
        linkedList7.printList();

        System.out.println("Remove");
        LinkedList linkedList8 = new LinkedList(0);
        linkedList8.append(1);
        linkedList8.append(2);
        linkedList8.append(3);
        linkedList8.remove(2);
        linkedList8.printList();

        System.out.println("Reverse");
        LinkedList linkedList9 = new LinkedList(1);
        linkedList9.append(2);
        linkedList9.append(3);
        linkedList9.append(4);
        linkedList9.reverse();
        linkedList9.printList();
    }
}
