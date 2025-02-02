package Assingment4;
public class Variant3a {
    static class Airport {
        private String name;

        public Airport(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    static class Aircraft {
        private String name;
        private int maxPassengers;

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
    }

    static class Passenger {
        private String name;
        private int seatNumber;

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
    }
    public static class Main {
        public static void main(String[] args) {
            // Create objects
            Airport airport = new Airport("International Airport");
            Aircraft aircraft1 = new Aircraft("Boeing 747", 300);
            Aircraft aircraft2 = new Aircraft("Airbus A380", 500);
            Passenger passenger1 = new Passenger("John Doe", 10);
            Passenger passenger2 = new Passenger("Jane Smith", 15);
            Passenger passenger3 = new Passenger("Alice Johnson", 20);

            // Display properties
            System.out.println("Airport Name: " + airport.getName());
            System.out.println("Aircraft 1: " + aircraft1.getName() + ", Max Passengers: " + aircraft1.getMaxPassengers());
            System.out.println("Aircraft 2: " + aircraft2.getName() + ", Max Passengers: " + aircraft2.getMaxPassengers());
            System.out.println("Passenger 1: " + passenger1.getName() + ", Seat Number: " + passenger1.getSeatNumber());
            System.out.println("Passenger 2: " + passenger2.getName() + ", Seat Number: " + passenger2.getSeatNumber());
            System.out.println("Passenger 3: " + passenger3.getName() + ", Seat Number: " + passenger3.getSeatNumber());
        }
    }
}
