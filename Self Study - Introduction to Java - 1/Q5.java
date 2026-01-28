
// Q5. Create a class named Employee with fields firstname,lastname,age and designation.
//
//  The class should:
//  1. have all types of constructors to initialize the object
//  2. class should also have setter methods to update a particular field
//  3. Override its toString method to display a meaningful message using all these fields.

class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private String designation;

    public Employee() {
        this.firstName = "Null";
        this.lastName = "Null";
        this.age = 0;
        this.designation = "Null";
    }

    public Employee(String firstName, String lastName, int age, String designation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.designation = designation;
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
        this.designation = "Null";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee Details: " +
                "Name = " + firstName + " " + lastName +
                ", Age = " + age +
                ", Designation = " + designation;
    }
}

public class Q5 {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        System.out.println(e1);

        Employee e2 = new Employee("Himanshu", "Sharma", 22, "Software Developer Trainee");
        System.out.println(e2);

        Employee e3 = new Employee("Badal", "Jaakhar");
        e3.setAge(25);
        e3.setDesignation("Lead Sales");

        System.out.println(e3);
    }
}
