package LinkedList;

import java.util.LinkedList;

public class MiddleLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original LinkedList: " + list);

        int middleIndex = list.size() / 2;
        System.out.println("Middle element: " + list.get(middleIndex));
    }
}
