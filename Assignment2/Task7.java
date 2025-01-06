package Assignment2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[6];
        int i;
        for (i = 0; i < 6; i++) {
            str[i] = sc.nextLine();
        }
        for (i = 0; i < 6; i++) {
            if (str[i] != null) {
                for (int j = 0; j < 6; j++) {
                    if (i != j && str[i] != null && str[i].equals(str[j])) {
                        str[i] = null;
                        str[j] = null;
                    }
                }
            }
        }
        for (i = 0; i < 6; i++) {
            System.out.println(str[i]);
        }
    }
}
