package ua.whydie.Queue;



public class CircularQueue {
    private Node front, rear;

    public CircularQueue() {
        this.front = this.rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = rear = newNode;
            rear.next = front; 
        } else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front;
        }
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty, dequeue not possible.");
            return -1;
        }

        int value;
        if (front == rear) { 
            value = front.data;
            front = rear = null;
        } else {
            Node temp = front;
            value = temp.data;
            front = front.next;
            rear.next = front;
        }

        return value;
    }

    public void printQueue() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        Node temp = front;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != front);
        System.out.println();
    }
}
