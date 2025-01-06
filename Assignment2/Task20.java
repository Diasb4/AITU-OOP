package Assignment2;

public class Task20 {
    public static void main(String[] args) {
        String name = "Olga";
        String surname = "Kipriyanovna";
        String meal = "Dumplings";
        printPersonInfo(name, surname, meal);
    }
    public static void printPersonInfo(String firstName, String lastName, String favoriteDish) {
        System.out.println("Brief Dossier:");
        System.out.println("Name: " + firstName);
        System.out.println("LastName: " + lastName);
        System.out.println("Favorite dish: " + favoriteDish);
    }
}
