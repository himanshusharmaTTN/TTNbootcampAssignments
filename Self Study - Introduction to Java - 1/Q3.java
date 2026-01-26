//Write a java program to show following menu to the user:
//
//        *******Menu*******
//        1. Calculate Area of Circle
//        2. Calculate Circumference of a Circle
//        3. Exit.
//     Choose an option (1-3):
//
//        Take radius as user input.
//        Hint: Use Switch statement to act on the menu. Also area and circumference methods should be static

import java.util.Scanner;

public class Q3 {

    static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        
            System.out.println("\n******* Menu *******");
            System.out.println("1. Calculate Area of Circle");
            System.out.println("2. Calculate Circumference of a Circle");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");

            int choice = sc.nextInt();

            if (choice == 3) {
                System.out.println("Exiting program...");
                return ;
            }

            System.out.print("Enter radius: ");
            double radius = sc.nextDouble();

            switch (choice) {

                case 1:
                    System.out.println("Area of circle = " + calculateArea(radius));
                    break;

                case 2:
                    System.out.println("Circumference of circle = " + calculateCircumference(radius));
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1, 2 or 3.");
            }

        sc.close();
    }
}
