package Assignment3;

public class Task26 {
        public static void main(String[] args) {
            String s1 = new String("JavaITU");
            s1 = "JavaENU";
            String s2 = "JavaENU";
             s2 = new String("JavaITU");
            String s3 = "JavaENU";
             s3 = new String("JavaITU");
            System.out.println(s1 == s3);
            System.out.println(s2.equals(s3));
        }
    }
