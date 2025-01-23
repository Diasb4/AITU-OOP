package Assignment3;

public class Task9 {
    interface CanMove{
        double speed();
    }
    interface CanFly extends CanMove{
        double speed(CanFly canFly);
    }
    public static class Car implements CanMove {
        @Override
        public double speed() {
            return 120.0;
        }
    }
    public static class Airplane implements CanFly {
        @Override
        public double speed() {
            return 600.0;
        }

        @Override
        public double speed(CanFly canFly) {
            return canFly.speed() + 100.0;
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Car speed: " + car.speed());
        Airplane airplane = new Airplane();
        System.out.println("Airplane speed: " + airplane.speed());
        System.out.println("Airplane speed with adjustment: " + airplane.speed(airplane));
    }
}
