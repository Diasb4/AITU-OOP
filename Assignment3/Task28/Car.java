package Assignment3.Task28;

public class Car {
    private String model;
    private int year;
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + model.hashCode();
        result = 31 * result + year;
        return result;
    }
}
