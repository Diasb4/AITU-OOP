package Assignment3;

public class Task8 {
    public static void main(String[] args) {
        interface Person {
            boolean isAlive();
        }

        interface Presentable extends Person {
            void present();
        }
        class Individual implements Presentable {
            private String name;
            private int age;
            private boolean alive;

            public Individual(String name, int age, boolean alive) {
                this.name = name;
                this.age = age;
                this.alive = alive;
            }
            @Override
            public boolean isAlive() {
                return this.alive;
            }
            @Override
            public void present() {
                if (this.alive) {
                    System.out.println("Hello, my name is " + name + ", and I am " + age + " years old.");
                }
                else {
                    System.out.println("Hello, my name is " + name + " I am dead");
                }
                }
        }
                Individual person1 = new Individual("John Doe", 30, true);
                System.out.println("Is John Doe alive? " + person1.isAlive());
                person1.present();
                Individual person2 = new Individual("Jane Doe", 25, false);
                System.out.println("Is Jane Doe alive? " + person2.isAlive());
                person2.present();
            }
        }