package Assingment4.Variant3cOld.Class;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private String name;
    private List<Aircraft> aircraftVehicles = new ArrayList<>();

    public Airport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Aircraft> getAircraftVehicles() {
        return aircraftVehicles;
    }

    public void addAircraft(Aircraft aircraft) {
        aircraftVehicles.add(aircraft);
    }

    public void removeAircraft(Aircraft aircraft) {
        aircraftVehicles.remove(aircraft);
    }

    // Method to find a passenger by aircraft name and seat number
    public Passenger findPassengerByAircraftNameAndSeatNumber(String aircraftName, int seatNumber) {
        for (Aircraft aircraft : aircraftVehicles) {
            if (aircraft.getName().equals(aircraftName)) {
                for (Passenger passenger : aircraft.getPassengers()) {
                    if (passenger.getSeatNumber() == seatNumber) {
                        return passenger;
                    }
                }
            }
        }
        return null; // Return null if no passenger is found
    }
}