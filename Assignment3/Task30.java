package Assignment3;

public class Task30 {
    private static boolean hasEggs = true;

    public static void main(String[] args) {
        boolean hasEggs = false; // Local variable
        makePurchases(hasEggs); // Pass local variable as argument
    }

    public static void makePurchases(boolean hasEggs) {
        // Use the parameter instead of the static field
        if (hasEggs) {
            System.out.println("Bought 10 loaves");
        } else {
            System.out.println("Bought 1 loaf");
        }
    }
}

