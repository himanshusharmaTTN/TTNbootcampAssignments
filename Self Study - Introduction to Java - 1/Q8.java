//Q8: WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
public class Q8 {

    public static void main(String[] args) {

        System.out.println("----- ClassNotFoundException Demo -----");

        try {
            // This class does NOT exist
            Class.forName("com.fake.UnknownClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException occurred!");
            System.out.println(e);
        }

        System.out.println("\n----- NoClassDefFoundError Demo -----");

        // JVM will try to load Helper class
        Helper h = new Helper();
        h.show();
    }
}
