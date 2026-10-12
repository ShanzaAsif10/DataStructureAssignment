
import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("--- TWO-DIMENSIONAL ARRAY ---");

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();

        if (rows <= 0 || columns <= 0) {
            System.out.println("Rows and columns must be greater than zero.");
            input.close();
            return;
        }

        int[][] array = new int[rows][columns];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(
                    "Enter element at row " + (i + 1) +
                    ", column " + (j + 1) + ": "
                );

                array[i][j] = input.nextInt();
            }
        }

        System.out.println("\nThe Two-Dimensional Array is:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + "\t");
            }

            System.out.println();
        }

        input.close();
    }
}