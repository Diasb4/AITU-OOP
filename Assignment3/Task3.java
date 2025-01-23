package Assignment3;

public class Task3 {
    public interface CanFly {
        public void fly();
    }
    public interface CanRun {
        public void run();
    }
    public interface CanSwim {
        public void swim();
    }
    public class Human implements CanRun, CanSwim {
        public void swim() {}
        public void run() {}
    }
    public class Duck implements CanRun, CanSwim, CanFly {
        public void swim() {}
        public void run() {}
        public void fly() {}

    }
    public class Penguin implements CanRun, CanSwim {
        public void swim() {}
        public void run() {}

    }
    public class Airplane implements CanFly{
        public void fly() {}

    }
    public static void main(String[] args) {

    }
}
