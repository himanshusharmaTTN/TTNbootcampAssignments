//Q2. Create a User class with fields:  firstname, lastname, age, phonenumber. Write a program which accepts values of user fields from commandline, create object and append that to a text file. After every user creation the program should prompt: "Do you want to continue creating users? (Type QUIT to exit)" and keep on accepting values and writing to file unitl user quits.

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class User {
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;

    public User(String firstName, String lastName, int age, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // Format user data for file writing
    public String toFileString() {
        return firstName + "," + lastName + "," + age + "," + phoneNumber + "\n";
    }
}

 class UserApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== User Creation Program ===");

        try (FileWriter fw = new FileWriter("users.txt", true)) { // append mode

            while (true) {

                System.out.print("Enter First Name: ");
                String fn = sc.nextLine();

                System.out.print("Enter Last Name: ");
                String ln = sc.nextLine();

                System.out.print("Enter Age: ");
                int age = Integer.parseInt(sc.nextLine());

                System.out.print("Enter Phone Number: ");
                String phone = sc.nextLine();

                // Create User object
                User user = new User(fn, ln, age, phone);

                // Write to file
                fw.write(user.toFileString());
                fw.flush();

                System.out.println("✅ User saved successfully.");

                System.out.print("\nDo you want to continue creating users? (Type QUIT to exit): ");
                String choice = sc.nextLine();

                if (choice.equalsIgnoreCase("QUIT")) {
                    System.out.println("Program terminated.");
                    break;
                }
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        sc.close();
    }
}
