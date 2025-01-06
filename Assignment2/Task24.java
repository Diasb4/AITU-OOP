package Assignment2;
import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        signIn(sc.nextLine());
    }
    public static void signIn(String username) {
        if (username.equals("user")) {
            return;
        }else {
            System.out.println("Welcome " + username);
            System.out.println("Missed you very much, " + username);
        }
    }
}
