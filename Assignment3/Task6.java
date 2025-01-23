package Assignment3;

public class Task6 {
    public static void main(String[] args) {}
    interface Selectable {
        void onSelect();
    }
    interface Updatable {
        void refresh();
    }
    public abstract class Screen implements Updatable, Selectable {
        @Override
        public void onSelect() {
        }
        @Override
        public void refresh() {
        }
    }
}
