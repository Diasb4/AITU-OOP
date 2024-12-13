import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //        Task2
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        if (age >= 18 && age <= 28) {
            System.out.println(name + "," + "come to the military registration and enlistment office");
        }
    }
}
