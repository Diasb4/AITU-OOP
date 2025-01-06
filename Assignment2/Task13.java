package Assignment2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int maximum = 0;
        int [][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maximum) {
                    maximum = arr[i][j];
                }
            }
        }
        System.out.println("Maximum value is: " + maximum);
    }
}
