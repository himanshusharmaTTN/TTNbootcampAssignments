// Q10. Using java 8 date/time api:
//  1. WAP to get two dates from user and print if the first date occurs bfore or after the second date supplied by the user.
//  2. WAP to print current date and time in 3 different time zones.

import java.time.LocalDate;
import java.util.Scanner;
import java.time.ZonedDateTime;
import java.time.ZoneId;
class DateComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first date (yyyy-MM-dd): ");
        String d1 = sc.nextLine();

        System.out.print("Enter second date (yyyy-MM-dd): ");
        String d2 = sc.nextLine();

        // Convert String to LocalDate
        LocalDate date1 = LocalDate.parse(d1);
        LocalDate date2 = LocalDate.parse(d2);

        // Compare dates
        if (date1.isBefore(date2)) {
            System.out.println("First date is BEFORE second date.");
        }
        else if (date1.isAfter(date2)) {
            System.out.println("First date is AFTER second date.");
        }
        else {
            System.out.println("Both dates are SAME.");
        }

        ZonedDateTime india = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        ZonedDateTime usa = ZonedDateTime.now(ZoneId.of("America/New_York"));

        ZonedDateTime japan = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println("India Time   : " + india);
        System.out.println("USA Time     : " + usa);
        System.out.println("Japan Time   : " + japan);

        sc.close();
    }
}


