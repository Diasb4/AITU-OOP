package Assignment3;

public class Task16 {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        String getColor();
        Integer getAge();
        String getName();
    }

    public static class Fox implements Animal {
        public String getName() {
            return "Fox.";
        }
        @Override
        public String getColor() {
            return null;
        }

        @Override
        public Integer getAge() {
            return null;
        }
    }
}
