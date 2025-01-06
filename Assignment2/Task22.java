package Assignment2;

public class Task22 {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }
    public static void reverseArray(int[] array) {
        int n = array.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = array[n - 1 - i];
        }
        for (int i = 0; i < n; i++) {
            array[i] = temp[i];
        }
    }
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
