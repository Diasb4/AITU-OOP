package Assignment3;

public class Task2 {
    interface CanFly{
        void fly();
    }
    interface CanMove{
        void move();
    }
    interface CanEat{
        void eat();
    }
    public class Dog implements CanMove,CanEat{
        public void eat() {}
        public void move() {}
    }
    public class Car implements CanMove{
        public void move() {}
    }
    public class Duck implements CanMove,CanEat, CanFly{
        public void eat() {}
        public void move() {}
        public void fly() {}
    }
    public class Airlane implements CanMove, CanFly{
        public void move() {}
        public void fly() {}
    }
    public static void main(String[] args) {}


}
