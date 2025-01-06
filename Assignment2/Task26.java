package Assignment2;

public class Task26 {
    public static void main(String[] args) {
        Person person = new Person("Ivan","Ivanov");
        System.out.println("Dossier.");
        System.out.println("Name: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Full name: " + person.getFullName());
    }
    public static class Person {
        private String firstName;
        private String lastName;
        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        protected String getFirstName() {
            return firstName;
        }
        String getLastName() {
            return lastName;
        }
        private String getFullName(){
            return firstName + " " + lastName;
        }
    }
}
