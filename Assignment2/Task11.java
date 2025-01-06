package Assignment2;
public class Task11 {
    // Public static variable multiArray of type int[][][][]
    public static int[][][][] multiArray = {
            {
                    {
                            {1, 2, 3},
                            {4, 5, 6}
                    },
                    {
                            {7, 8, 9},
                            {10, 11, 12}
                    }
            },
            {
                    {
                            {13, 14, 15},
                            {16, 17, 18}
                    },
                    {
                            {19, 20, 21},
                            {22, 23, 24}
                    }
            }
    };

    public static void main(String[] args) {
        // Display all numbers from multiArray
        for (int[][][] i : multiArray) {
            for (int[][] j : i) {
                for (int[] k : j) {
                    for (int num : k) {
                        System.out.println(num);
                    }
                }
            }
        }
    }
}

