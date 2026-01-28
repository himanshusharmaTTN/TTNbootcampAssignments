//Given the following class
//Employee class{ Double Age; Double Salary; String Name}
//Design the class in such a way that the default sorting should work on firstname and lastname.
//Also, Write a program to sort Employee objects based on salary using Comparator.

import java.util.*;

class Employe implements Comparable<Employe> {

    Double age;
    Double salary;
    String name;

    public Employe(String name, Double age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employe e) {

        String[] thisName = this.name.split(" ");
        String[] otherName = e.name.split(" ");

        String thisFirst = thisName[0];
        String thisLast = thisName.length > 1 ? thisName[1] : "";

        String otherFirst = otherName[0];
        String otherLast = otherName.length > 1 ? otherName[1] : "";

        int firstCompare = thisFirst.compareToIgnoreCase(otherFirst);

        if (firstCompare != 0) {
            return firstCompare;
        }

        return thisLast.compareToIgnoreCase(otherLast);
    }

    @Override
    public String toString() {
        return name + " | Age: " + age + " | Salary: " + salary;
    }
}

class SalaryComparator implements Comparator<Employe> {
    public int compare(Employe e1, Employe e2) {
        return e1.getSalary().compareTo(e2.getSalary());
    }
}

 class EmployeeSortDemo {

    public static void main(String[] args) {

        List<Employe> list = new ArrayList<>();

        list.add(new Employe("Amit Sharma", 25.0, 40000.0));
        list.add(new Employe("Himanshu Sharma", 28.0, 55000.0));
        list.add(new Employe("Amit Kumar", 30.0, 35000.0));
        list.add(new Employe("Neha Singh", 26.0, 60000.0));

        System.out.println("Before sorting:");
        list.forEach(System.out::println);

        Collections.sort(list);
        System.out.println("\nAfter default sorting (FirstName + LastName):");
        list.forEach(System.out::println);

        Collections.sort(list, new SalaryComparator());
        System.out.println("\nAfter sorting by Salary:");
        list.forEach(System.out::println);
    }
}
