package Assignment2;
import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(cube(n));
    }
    public static long cube(long n) {
        long cube = 0;
       for (int i = 1; i <= 3; i++) {
           cube = n*n*n;
       }
       return cube;
    }
}
