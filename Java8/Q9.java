// Q9.Given a list of objects of following class:
//
//      class Employee{
//      String fullName;
//      Long salary;
//      String city;
//      }
//  Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
//  Note: Full name is concatenation of first name, middle name and last name with single space in between.

import java.util.*;
import java.util.stream.*;

class NEmployee {
    String fullName;
    Long salary;
    String city;

    NEmployee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public Long getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }
}

 class EmployeeStream {

    public static void main(String[] args) {

        List<NEmployee> employees = Arrays.asList(
                new NEmployee("Himanshu Sharma", 45000L, "Delhi"),
                new NEmployee("Amit Singh", 3000L, "Delhi"),
                new NEmployee("Rahul Mehta", 2000L, "Delhi"),
                new NEmployee("Tania Bhardawaj", 7000L, "Delhi"),
                new NEmployee("Rohit Rawat", 4500L, "Mumbai"),
                new NEmployee("Badal Jaakhar", 3500L, "Delhi")
        );

        List<String> result =
                employees.stream()
                        .filter(e -> e.getSalary() < 5000)
                        .filter(e -> e.getCity().equalsIgnoreCase("delhi"))
                        .map(e -> e.getFullName().split(" ")[0])
                        .distinct()
                        .collect(Collectors.toList());

        System.out.println("Unique first names: " + result);
    }
}

