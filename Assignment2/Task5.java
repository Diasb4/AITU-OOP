package Assignment2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int i = 0;
        int[] array = new int[1000000];
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        if(N % 2 !=0) {
        for (i = N; i >= 0 ; i--) {
            System.out.print(array[i] + " ");
            }
        } else {
            for (i = 0; i < N ; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
