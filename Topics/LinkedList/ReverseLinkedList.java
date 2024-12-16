package LinkedList;

import java.util.LinkedList;
import java.util.Collections;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Og: " + list);

        Collections.reverse(list);
        System.out.println("Reversed: " + list);
    }
}
