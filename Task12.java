import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Task 8
        int sum = 0;
        int n = 0;
        while (n <= 100){
            if (n % 3 ==0){
                n++;
                continue;
            }
            sum += n;
            n++;
        }
            System.out.println(sum);
    }
}
