package Assignment2;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = height * 2 - 1;
        char[][] field = new char[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                field[i][j] = ' ';
            }
        }

        for (int i = 0; i < height; i++) {
            int start = height - 1 - i;
            int end = height - 1 + i;
            for (int j = start; j <= end; j++) {
                field[i][j] = '#';
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}
