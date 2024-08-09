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
            rear.next = front; // Замыкаем круг
        } else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front; // Обновляем замыкание
        }
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty, dequeue not possible.");
            return -1;
        }

        int value;
        if (front == rear) { // Если в очереди один элемент
            value = front.data;
            front = rear = null;
        } else {
            Node temp = front;
            value = temp.data;
            front = front.next;
            rear.next = front; // Поддерживаем круговую структуру
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
