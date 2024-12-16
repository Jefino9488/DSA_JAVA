package Queue;

public class CustomQueue {
    private final int[] elements;
    private int front;
    private int rear;
    private int size;
    private final int capacity;

    public CustomQueue(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
        front = 0;
        size = 0;
        rear = capacity - 1;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int item) {
        if (isFull()) return;
        rear = (rear + 1) % capacity;
        elements[rear] = item;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) return -1;
        int item = elements[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public int front() {
        if (isEmpty()) return -1;
        return elements[front];
    }

    public int rear() {
        if (isEmpty()) return -1;
        return elements[rear];
    }

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.dequeue());
        System.out.println(queue.front());
        System.out.println(queue.rear());
    }
}
