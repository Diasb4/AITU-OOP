package Assignment2;
import java.util.Scanner;

public class Solution {
        public static final String ODD = "Odd";
        public static final String EVEN = "Even";
        public static String[] strings = new String[1000000000];
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int n = sc.nextInt();
            for (i = 0; i < n; i++) {
                strings[i] = sc.next();
        }
            System.out.print("index = " + i);
            System.out.println(" value = " + strings[i]);
            if(i == n) {
                for (i = 0; i < n; i++) {
                    System.out.print("index = " + i);
                    System.out.println(" value = " + strings[i]);
                }
            }
        if (n % 2 == 0) {
            System.out.println(EVEN);
        } else {
            System.out.println(ODD);
        }

        }
    }

