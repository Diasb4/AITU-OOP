package Assignment3.Task27;

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Iphone)) {
            return false;
        }
        Iphone other = (Iphone)obj;

        return this.model.equals(other.model)
                && this.color.equals(other.color)
                && this.price == other.price;
    }
}
