package Assignment3.Task29;
import java.util.Arrays;

import static Assignment3.Task29.Memory.executeDefragmentation;

public class Task29 {
        public static void main(String[] args) {
            String[] memory = {"object15", null, null, "object2", null, null, null, null, "object32", null, "object4"};
            executeDefragmentation(memory);
            System.out.println(Arrays.toString(memory));
        }

}
