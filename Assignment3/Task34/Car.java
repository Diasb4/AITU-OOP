package Assignment3.Task34;

public class Car {
    private String model;
    private int year;
    private String color;

    // The initialize method to set the values of model, year, and color
    public void initialize(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Optional: Methods to display the car details (for testing purposes)
    public void displayCarDetails() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }
}

