//Q7 WAP showing try, multi-catch and finally blocks.

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;   // -> may cause ArithmeticException

            System.out.println("Result = " + result);
        }
       catch (ArithmeticException | InputMismatchException e) {
            System.out.println("Error occurred!");
            System.out.println("Message: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed. Program ended safely.");
            sc.close();
        }
    }
}
