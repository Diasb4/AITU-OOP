package Assignment3;

// Main Class
public class Task7 {
    public static void main(String[] args) {
        System.out.println(Dream.HOBBY);
        System.out.println(new Hobby());
    }
    interface Desire {
    }
    interface Dream {
      public static Hobby HOBBY = new Hobby();
    }
    public static class Hobby implements Desire, Dream {
        private static int index = 1;

        @Override
        public String toString() {
            return String.valueOf(++index);
        }
    }
}
