package com.sudhansu.dsa.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        System.out.println("Constructor");
        DoublyLinkedList doublyLinkedList1 = new DoublyLinkedList(7);
        doublyLinkedList1.getHead();
        doublyLinkedList1.getTail();
        doublyLinkedList1.getLength();
        doublyLinkedList1.printList();

        System.out.println("Append");
        DoublyLinkedList doublyLinkedList2 = new DoublyLinkedList(1);
        doublyLinkedList2.append(2);
        doublyLinkedList2.append(3);
        doublyLinkedList2.printList();

        System.out.println("Remove Last");
        DoublyLinkedList doublyLinkedList3 = new DoublyLinkedList(1);
        doublyLinkedList3.append(2);
        System.out.println(doublyLinkedList3.removeLast().value);
        System.out.println(doublyLinkedList3.removeLast().value);
        System.out.println(doublyLinkedList3.removeLast());

        System.out.println("Prepend");
        DoublyLinkedList doublyLinkedList4 = new DoublyLinkedList(2);
        doublyLinkedList4.append(3);
        doublyLinkedList4.prepend(1);
        doublyLinkedList4.printList();

        System.out.println("Remove First");
        DoublyLinkedList doublyLinkedList5 = new DoublyLinkedList(2);
        doublyLinkedList5.append(1);
        System.out.println(doublyLinkedList5.removeFirst().value);
        System.out.println(doublyLinkedList5.removeFirst().value);
        System.out.println(doublyLinkedList5.removeFirst());

        System.out.println("Get");
        DoublyLinkedList doublyLinkedList6 = new DoublyLinkedList(0);
        doublyLinkedList6.append(1);
        doublyLinkedList6.append(2);
        doublyLinkedList6.append(3);
        System.out.println(doublyLinkedList6.get(1).value);
        System.out.println(doublyLinkedList6.get(2).value);

        System.out.println("Set");
        DoublyLinkedList doublyLinkedList7 = new DoublyLinkedList(11);
        doublyLinkedList7.append(3);
        doublyLinkedList7.append(23);
        doublyLinkedList7.append(7);
        System.out.println(doublyLinkedList7.set(1, 4));
        doublyLinkedList7.printList();

        System.out.println("Insert");
        DoublyLinkedList doublyLinkedList8 = new DoublyLinkedList(1);
        doublyLinkedList8.append(3);
        doublyLinkedList8.insert(1, 2);
        doublyLinkedList8.printList();

        System.out.println("Remove");
        DoublyLinkedList doublyLinkedList9 = new DoublyLinkedList(0);
        doublyLinkedList9.append(1);
        doublyLinkedList9.append(2);
        doublyLinkedList9.remove(1);
        doublyLinkedList9.printList();
    }
}
