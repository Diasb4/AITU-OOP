package Assignment3;

public class Task4 {
    interface CanRun{
        void run();
    }
    interface CanSwim{
        void swim();
    }

    public abstract class Human implements CanRun, CanSwim{
    }
    public static void main(String[] args) {

    }
}
