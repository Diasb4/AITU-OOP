package Assingment4;
import java.util.ArrayList;
import java.util.List;

public class Variant3b {
    static class Airport {
        private String name;
        private List<Aircraft> aircraftVehicles;

        public Airport(String name) {
            this.name = name;
            this.aircraftVehicles = new ArrayList<>();
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
            aircraft.setAirport(this); // Link aircraft to airport
        }

        public void removeAircraft(Aircraft aircraft) {
            aircraftVehicles.remove(aircraft);
            aircraft.setAirport(null); // Unlink aircraft from airport
        }
    }

    // Updated Aircraft class
    static class Aircraft {
        private String name;
        private int maxPassengers;
        private Airport airport;
        private List<Passenger> passengers;

        public Aircraft(String name, int maxPassengers) {
            this.name = name;
            this.maxPassengers = maxPassengers;
            this.passengers = new ArrayList<>();
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

        public Airport getAirport() {
            return airport;
        }

        public void setAirport(Airport airport) {
            this.airport = airport;
        }

        public List<Passenger> getPassengers() {
            return passengers;
        }

        public void addPassenger(Passenger passenger) {
            passengers.add(passenger);
            passenger.setAircraft(this); // Link passenger to aircraft
        }

        public void removePassenger(Passenger passenger) {
            passengers.remove(passenger);
            passenger.setAircraft(null); // Unlink passenger from aircraft
        }
    }

    static class Passenger {
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
    }

    public static class Main {
        public static void main(String[] args) {
            // Create objects
            Airport airport = new Airport("International Airport");
            Aircraft aircraft1 = new Aircraft("Boeing 747", 300);
            Aircraft aircraft2 = new Aircraft("Airbus A380", 500);
            Passenger passenger1 = new Passenger("Alisher", 10);
            Passenger passenger2 = new Passenger("Janat", 15);
            Passenger passenger3 = new Passenger("Arman", 20);
            Passenger passenger4 = new Passenger("Beksultan", 25);
            airport.addAircraft(aircraft1);
            airport.addAircraft(aircraft2);
            aircraft1.addPassenger(passenger1);
            aircraft1.addPassenger(passenger2);
            aircraft2.addPassenger(passenger3);
            aircraft2.addPassenger(passenger4);

            System.out.println("Passengers on " + aircraft2.getName() + ":");
            for (Passenger passenger : aircraft2.getPassengers()) {
                System.out.println("- " + passenger.getName() + ", Seat Number: " + passenger.getSeatNumber());
            }
        }
    }
}
