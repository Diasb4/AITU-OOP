package Assignment2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("-1");
        } else {
            int[] m = new int[n];
            for(int i = 1; i <= n; i++){
                m[i] = sc.nextInt();
            }
            int[][] multiArray = new int[n][];
            for (int i = 0; i < n; i++) {
                multiArray[i] = new int[m[i]];
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m[i]; j++) {
                    multiArray[i][j] = i + j;
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < multiArray.length; j++) {
                    System.out.print(multiArray[i][j] + " ");
                }
                System.out.println();
            }

        }
    }
}
