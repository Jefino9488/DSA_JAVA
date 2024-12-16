package Queue;

public class Stack {
    private int[] stackArray;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public Stack(int size) {
        stackArray = new int[size];
        capacity = size;
        top = -1;
    }

    // Push element onto the stack
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stackArray[++top] = value;
    }

    // Pop element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1; // Return -1 if stack is empty
        }
        return stackArray[top--];
    }

    // Peek the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1; // Return -1 if stack is empty
        }
        return stackArray[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Return the current size of the stack
    public int size() {
        return top + 1;
    }

    // Display the stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display(); // Output: Stack elements: 10 20 30

        System.out.println("Top element is: " + stack.peek()); // Output: 30

        stack.pop();
        stack.display(); // Output: Stack elements: 10 20

        System.out.println("Stack size is: " + stack.size()); // Output: 2

        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
    }
}
