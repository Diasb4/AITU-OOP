import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //        Task 3
        Scanner sc = new Scanner(System.in);
        int temperature = sc.nextInt();
        boolean IsHigh = temperature > 37;
        boolean IsLow = temperature < 36;
        if (!IsHigh && !IsLow) {
            System.out.println("Normal");
        }else System.out.println(IsHigh ? "High" : "Low");
    }
}
