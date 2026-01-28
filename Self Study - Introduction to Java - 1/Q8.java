//Q8: WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
public class Q8 {

    public static void main(String[] args) {

        System.out.println("----- ClassNotFoundException Demo -----");

        try {
            Class.forName("com.fake.UnknownClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException occurred!");
            System.out.println(e);
        }

        System.out.println("\n----- NoClassDefFoundError Demo -----");
        
        Helper h = new Helper();
        h.show();
    }
}
