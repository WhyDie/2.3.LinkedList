package ua.whydie;

import ua.whydie.Queue.CircularQueue;

public class Main {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Initial queue:");
        queue.printQueue();

        System.out.println("Dequeue operation:");
        queue.dequeue();
        queue.printQueue();

        System.out.println("Dequeue operation:");
        queue.dequeue();
        queue.printQueue();
    }
}