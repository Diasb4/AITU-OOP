package Assignment3.Task18;
import java.util.List;

public class RepkaStory {
    public static void tell(List<Person> items) {
        for (int i = items.size() - 1; i > 0; i--) {
            Person first = items.get(i);
            Person second = items.get(i - 1);
            first.pull(second);
        }
    }
}