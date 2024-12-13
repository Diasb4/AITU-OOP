import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int m = 0;
        while (sc.hasNext()) {
            if (sc.hasNextInt())
            {
                int n = sc.nextInt();
                 m += n;
            }else
            {
                String input = sc.next();
                if (input.equalsIgnoreCase("ENTER"))
            {
                break;
            }
            }
        }
        System.out.println(m);
    }
}
