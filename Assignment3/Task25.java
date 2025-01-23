package Assignment3;

public class Task25 {
    public class Programmer {
        private int salary = 1000;
        public int getSalary() {
            return this.salary;
        }

        public void setSalary(int newSalary) {
            if (newSalary > this.salary) {
                this.salary = newSalary;
            }
        }
    }
    public static void main(String[] args) {

    }
}
