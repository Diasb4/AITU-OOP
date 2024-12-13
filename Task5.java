import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //        Task 1
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("it’s cold outside");
        } else {
            System.out.println("it's warm outside");
        }
    }
}
