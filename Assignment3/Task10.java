package Assignment3;

public class Task10 {// Main class to execute the program
        public static void main(String[] args) throws Exception {
            // Test implementation
            Manager manager = new Manager();
            Subordinate subordinate = new Subordinate();

            manager.use(subordinate); // Manager instructs subordinate
            subordinate.startToWork(); // Subordinate starts working

            System.out.println("Does the manager inspire others? " + manager.inspiresOthersToWork());
        }
    }

    interface Person {
        void use(Person person);
        void startToWork();
    }
    interface HasManagementPotential {
        boolean inspiresOthersToWork();
    }

    interface Secretary extends Person {
    }
    interface Boss extends Person, HasManagementPotential {
    }

    class Manager implements Boss {
        @Override
        public void use(Person person) {
            person.startToWork();
        }

        @Override
        public void startToWork() {
            System.out.println("Manager is starting to work.");
        }

        @Override
        public boolean inspiresOthersToWork() {
            return true;
        }
    }
    class Subordinate implements Secretary {
        @Override
        public void use(Person person) {
            System.out.println("Subordinate is interacting with another person.");
        }

        @Override
        public void startToWork() {
            System.out.println("Subordinate is starting to work.");
        }
    }
