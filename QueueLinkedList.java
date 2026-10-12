
import java.util.Scanner;

public class QueueLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node front;
        Node rear;

        Queue() {
            front = null;
            rear = null;
        }

        void enqueue(int data) {
            Node newNode = new Node(data);

            if (rear == null) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }

            System.out.println(data + " inserted into queue.");
        }

        void dequeue() {
            if (front == null) {
                System.out.println("Queue is empty!");
                return;
            }

            System.out.println("Removed element: " + front.data);
            front = front.next;

            if (front == null) {
                rear = null;
            }
        }

        void peek() {
            if (front == null) {
                System.out.println("Queue is empty!");
            } else {
                System.out.println("Front element: " + front.data);
            }
        }

        void display() {
            if (front == null) {
                System.out.println("Queue is empty!");
                return;
            }

            Node current = front;

            System.out.println("Queue elements (front to rear):");

            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue queue = new Queue();

        int choice;

        do {
            System.out.println("\n--- QUEUE USING LINKED LIST ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int value = input.nextInt();
                    queue.enqueue(value);
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.peek();
                    break;

                case 4:
                    queue.display();
                    break;

                case 5:
                    System.out.println("Exiting Queue program.");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        input.close();
    }
}
