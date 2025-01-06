package Assignment2;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        char[][] array = {
                {'a', 'b', 'c', 'd', 'e', 'f'},
                {'g', 'h', 'i', 'j', 'k', 'l'},
                {'m', 'n', 'o', 'p', 'q', 'r'},
                {'s', 't', 'u', 'v', 'w', 'x'}
        };

        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 1; j < array[i].length - 1; j++) {
                array[i][j] = '-';
            }
        }

        for (char[] row : array) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}