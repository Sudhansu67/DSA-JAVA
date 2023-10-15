package com.sudhansu.dsa.queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Constructor");
        Queue queue1 = new Queue(7);
        queue1.getFirst();
        queue1.getLast();
        queue1.getLength();
        queue1.printQueue();

        System.out.println("Enqueue");
        Queue queue2 = new Queue(1);
        queue2.enqueue(2);
        queue2.enqueue(3);
        queue2.printQueue();

        System.out.println("Dequeue");
        Queue queue3 = new Queue(2);
        queue3.enqueue(1);

        System.out.println(queue3.dequeue().value);
        System.out.println(queue3.dequeue().value);
        System.out.println(queue3.dequeue());
    }
}
