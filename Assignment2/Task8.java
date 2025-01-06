package Assignment2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int[][] MULTIPLICATION_TABLE = new int[10][10];

        // Populate the MULTIPLICATION_TABLE with multiplication values
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                MULTIPLICATION_TABLE[i][j] = (i + 1) * (j + 1);
            }
        }

        // Print the MULTIPLICATION_TABLE with the required format
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(MULTIPLICATION_TABLE[i][j]);
                if (j < 9) { // Add a space if not the last number in the row
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

