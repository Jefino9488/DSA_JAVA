package Queue;

import java.util.Queue;

public class Operation {
    public static Queue<Integer> enQueue(Queue<Integer> q1, int data) {
        q1.add(data);
        return q1;
    }
    public static Queue<Integer> deQueue(Queue<Integer> q1) {
        q1.poll();
        return q1;
    }
    public static void display(Queue<Integer> q1) {
        System.out.println(q1);
    }
    public static void main(String[] args) {
        Queue<Integer> q1 = new java.util.LinkedList<>();
        q1 = enQueue(q1, 10);
        q1 = enQueue(q1, 20);
        q1 = enQueue(q1, 30);
        display(q1);
        q1 = deQueue(q1);
        display(q1);
    }
}
