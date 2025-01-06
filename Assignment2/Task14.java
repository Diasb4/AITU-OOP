package Assignment2;

import java.util.Scanner;

public class Task14 {
        public static int[][] array = new int[3][3];
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    array[i][j] = sc.nextInt();
                }
            }
            int[] rowSums = new int[3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    rowSums[i] += array[i][j];
                }
            }
            int[] colSums = new int[3];
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {
                    colSums[j] += array[i][j];
                }
            }

            int smallestSum = rowSums[0];
            for (int i = 1; i < 3; i++) {
                if (rowSums[i] < smallestSum) {
                    smallestSum = rowSums[i];
                }
            }
            for (int j = 0; j < 3; j++) {
                if (colSums[j] < smallestSum) {
                    smallestSum = colSums[j];
                }
            }
            System.out.println(smallestSum);
        }
    }
