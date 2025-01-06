package Assignment2;

public class Task12 {
    public static int[][] array = new int[2][3];

    public static void main(String[] args) {
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;

        for (int[] row : array) {
            for (int num : row) {
                System.out.println(num);
            }
        }
    }
}

