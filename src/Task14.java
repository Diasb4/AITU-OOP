import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int start = sc.nextInt();
        int end = sc.nextInt();
        int multi = sc.nextInt();
        int sum = 0;
        for (int i = start; i < end; i++) {
            if (i % multi != 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
