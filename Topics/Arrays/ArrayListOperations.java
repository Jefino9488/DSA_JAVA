package Arrays;

import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("After adding elements: " + list);

        System.out.println("Element at index 1: " + list.get(1));

        list.set(1, 25);
        System.out.println("After updating: " + list);

        list.remove(2);
        System.out.println("After removing an element: " + list);

        System.out.println("Final list: " + list);
    }
}

