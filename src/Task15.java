import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 10;
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("8");
            }

            System.out.println();
        }
    }
}  
