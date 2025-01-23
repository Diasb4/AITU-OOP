package Assignment3.Task29;

import java.util.Arrays;

public class Memory {
    public static void executeDefragmentation(String[] array) {
        if (array == null) {
            return;
        }
        int writeIndex = 0;
        for (int readIndex = 0; readIndex < array.length; readIndex++) {
            if (array[readIndex] != null) {
                if (writeIndex != readIndex) {
                    array[writeIndex] = array[readIndex];
                    array[readIndex] = null;
                }
                writeIndex++;
            }
        }
    }
}