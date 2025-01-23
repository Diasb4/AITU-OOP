package Assignment3;

public class Task11 {
    interface CanMove {
        void move();
    }

    interface CanEat {
        void eat();
    }
    interface CanBeEaten {
        void beEaten();
    }

    class Cat implements CanMove, CanEat, CanBeEaten {
        @Override
        public void move() {
            System.out.println("Cat moves");
        }

        @Override
        public void eat() {
            System.out.println("Cat eats");
        }

        @Override
        public void beEaten() {
            System.out.println("Cat can be eaten");
        }
    }

    class Dog implements CanMove, CanEat {
        @Override
        public void move() {
            System.out.println("Dog moves");
        }

        @Override
        public void eat() {
            System.out.println("Dog eats");
        }
    }
    class Mouse implements CanMove, CanBeEaten {
        @Override
        public void move() {
            System.out.println("Mouse moves");
        }

        @Override
        public void beEaten() {
            System.out.println("Mouse can be eaten");
        }
    }

    public static void main(String[] args) {
        Task11 task = new Task11();

        Cat cat = task.new Cat();
        Dog dog = task.new Dog();
        Mouse mouse = task.new Mouse();

        cat.move();
        cat.eat();
        cat.beEaten();

        dog.move();
        dog.eat();

        mouse.move();
        mouse.beEaten();
    }
}
