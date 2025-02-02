package Assingment4.Variant3cOld.Class;

import java.util.ArrayList;
import java.util.List;

public class Aircraft {
    private String name;
    private int maxPassengers;
    private List<Passenger> passengers = new ArrayList<>();
    private Airport airport;

    public Aircraft(String name, int maxPassengers) {
        this.name = name;
        this.maxPassengers = maxPassengers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void addPassenger(Passenger passenger) {
        if (passengers.size() < maxPassengers) {
            passengers.add(passenger);
            passenger.setAircraft(this); // Set the aircraft for the passenger
        } else {
            System.out.println("Cannot add more passengers. Maximum capacity reached.");
        }
    }

    public void removePassenger(Passenger passenger) {
        passengers.remove(passenger);
        passenger.setAircraft(null); // Remove the association with the aircraft
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    @Override
    public String toString() {
        return "Aircraft{name='" + name + "', maxPassengers=" + maxPassengers + ", passengers=" + passengers.size() + "}";
    }
}