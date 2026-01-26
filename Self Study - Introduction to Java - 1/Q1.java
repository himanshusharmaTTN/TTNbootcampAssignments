
// Q1. Write a class with FirstName, LastName & age field. Print Firstname, LastName & age using static block, static method & static variable respectively.

class Person {

    // static variable
    static int age = 22;

    // static block
    static {
        String firstName = "Himanshu";
        System.out.println("First Name (from static block): " + firstName);
    }

    // static method
    static void printLastName() {
        String lastName = "Sharma";
        System.out.println("Last Name (from static method): " + lastName);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Person.printLastName();
        System.out.println("Age (from static variable): " + Person.age);
    }
}
