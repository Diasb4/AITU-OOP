package Assingment4.Variant3cOld.Class;

import Assingment4.Variant3cOld.Class.Airport;
import Assingment4.Variant3cOld.Class.Aircraft;
import Assingment4.Variant3cOld.Class.Passenger;

public class Variant3c {
    public static void main(String[] args) {
        // Create an Airport object
        Airport airport = new Airport("International Airport");

        // Create two Aircraft objects
        Aircraft aircraft1 = new Aircraft("Boeing 747", 300);
        Aircraft aircraft2 = new Aircraft("Airbus A380", 500);

        // Add aircraft to the airport
        airport.addAircraft(aircraft1);
        airport.addAircraft(aircraft2);

        // Create three Passenger objects
        Passenger passenger1 = new Passenger("Jhose", 1);
        Passenger passenger2 = new Passenger("Anna", 2);
        Passenger passenger3 = new Passenger("Alice", 3);

        // Add one passenger to the first aircraft
        aircraft1.addPassenger(passenger1);

        // Add three passengers to the second aircraft
        aircraft2.addPassenger(passenger2);
        aircraft2.addPassenger(passenger3);

        // Display passengers assigned to the second aircraft
        System.out.println("Passengers assigned to " + aircraft2.getName() + ":");
        for (Passenger passenger : aircraft2.getPassengers()) {
            System.out.println(passenger.getName() + ", Seat Number: " + passenger.getSeatNumber());
        }

        // Search for a passenger by aircraft name and seat number
        String aircraftName = "Airbus A380";
        int seatNumber = 2;
        Passenger foundPassenger = airport.findPassengerByAircraftNameAndSeatNumber(aircraftName, seatNumber);

        if (foundPassenger != null) {
            System.out.println("Found Passenger:");
            System.out.println("Name: " + foundPassenger.getName() + ", Seat Number: " + foundPassenger.getSeatNumber());
        } else {
            System.out.println("No passenger found with the given aircraft name and seat number.");
        }
    }
}