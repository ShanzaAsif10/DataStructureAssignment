
import java.util.Scanner;

public class StackLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        Node top;

        Stack() {
            top = null;
        }

        void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;

            System.out.println(data + " pushed into stack.");
        }

        void pop() {
            if (top == null) {
                System.out.println("Stack is empty!");
                return;
            }

            System.out.println("Popped element: " + top.data);
            top = top.next;
        }

        void peek() {
            if (top == null) {
                System.out.println("Stack is empty!");
            } else {
                System.out.println("Top element: " + top.data);
            }
        }

        void display() {
            if (top == null) {
                System.out.println("Stack is empty!");
                return;
            }

            Node current = top;

            System.out.println("Stack elements (top to bottom):");

            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack stack = new Stack();

        int choice;

        do {
            System.out.println("\n--- STACK USING LINKED LIST ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = input.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    System.out.println("Exiting Stack program.");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        input.close();
    }
}
