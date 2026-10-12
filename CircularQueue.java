
import java.util.Scanner;

public class CircularQueue {

    static class Queue {
        int[] array;
        int front;
        int rear;
        int size;
        int capacity;

        Queue(int capacity) {
            this.capacity = capacity;
            array = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        boolean isEmpty() {
            return size == 0;
        }

        boolean isFull() {
            return size == capacity;
        }

        void enqueue(int data) {
            if (isFull()) {
                System.out.println("Circular Queue is full!");
                return;
            }

            rear = (rear + 1) % capacity;
            array[rear] = data;
            size++;

            System.out.println(data + " inserted into circular queue.");
        }

        void dequeue() {
            if (isEmpty()) {
                System.out.println("Circular Queue is empty!");
                return;
            }

            System.out.println("Removed element: " + array[front]);

            front = (front + 1) % capacity;
            size--;
        }

        void display() {
            if (isEmpty()) {
                System.out.println("Circular Queue is empty!");
                return;
            }

            System.out.println("Circular Queue elements:");

            for (int i = 0; i < size; i++) {
                int index = (front + i) % capacity;
                System.out.print(array[index] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter circular queue capacity: ");
        int capacity = input.nextInt();

        if (capacity <= 0) {
            System.out.println("Capacity must be greater than zero.");
            input.close();
            return;
        }

        Queue queue = new Queue(capacity);

        int choice;

        do {
            System.out.println("\n--- CIRCULAR QUEUE USING ARRAY ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Check if Empty");
            System.out.println("5. Check if Full");
            System.out.println("6. Exit");
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
                    queue.display();
                    break;

                case 4:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Queue is not empty.");
                    }
                    break;

                case 5:
                    if (queue.isFull()) {
                        System.out.println("Queue is full.");
                    } else {
                        System.out.println("Queue is not full.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting Circular Queue program.");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);

        input.close();
    }
}
