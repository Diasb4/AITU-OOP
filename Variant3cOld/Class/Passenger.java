package Assingment4.Variant3cOld.Class;

public class Passenger {
    private String name;
    private int seatNumber;
    private Aircraft aircraft;

    public Passenger(String name, int seatNumber) {
        this.name = name;
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    @Override
    public String toString() {
        return "Passenger{name='" + name + "', seatNumber=" + seatNumber + ", aircraft=" + (aircraft != null ? aircraft.getName() : "none") + "}";
    }
}
