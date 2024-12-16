package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {

    public Node insertAtBeginning(Node head, int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static Node insertAtEnd(Node head, int value) {
        Node newNode = new Node(value);
        if (head == null)
            return newNode;

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        return head;
    }

    public static Node insertPos(Node head, int pos, int data) {
        if (pos < 1) {
            System.out.println("Invalid position!");
            return head;
        }

        if (pos == 1) {
            Node temp = new Node(data);
            temp.next = head;
            return temp;
        }

        Node prev = head;
        int count = 1;
        while (count < pos - 1 && prev != null) {
            prev = prev.next;
            count++;
        }

        if (prev == null) {
            System.out.println("Invalid position!");
            return head;
        }

        Node temp = new Node(data);
        temp.next = prev.next;
        prev.next = temp;
        return head;
    }

    public static Node removeFirstNode(Node head) {
        if (head == null) {
            return null;
        }
        head = head.next;
        return head;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        Node head = null;

        head = list.insertAtBeginning(head, 10);
        head = list.insertAtBeginning(head, 20);
        head = list.insertAtBeginning(head, 30);

        System.out.println("After insertion at the beginning:");
        printList(head);

        head = insertAtEnd(head, 40);
        head = insertAtEnd(head, 50);

        System.out.println("After insertion at the end:");
        printList(head);

        head = insertPos(head, 3, 25);

        System.out.println("After insertion at position 3:");
        printList(head);

        head = removeFirstNode(head);

        System.out.println("After removing the first node:");
        printList(head);
    }
}
