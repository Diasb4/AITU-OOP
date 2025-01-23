package Assignment3;

public class Task5 {
    public static void main(String[] args) throws Exception {
    }
    public interface Drinker {
        void askForMore(String message);
        void sayThankYou();
        boolean isReadyToGoHome();
    }
    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;
        void sleepOnTheFloor();
        void askForMore(String message);
        void sayThankYou();
        boolean isReadyToGoHome();
    }
    public static abstract class BeerLover implements Alcoholic {
        void sleepOnTheFLoor(){
            System.out.println("Sleeping on the floor");
        }
        public boolean isReadyToGoHome(){
            if (READY_TO_GO_HOME == true) {
                return READY_TO_GO_HOME;
            }
            else {
                return false;
            }
        }
    }
}
