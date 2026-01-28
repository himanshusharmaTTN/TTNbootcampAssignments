//Q4. Create class Employee with attributes name,age,designation and use instances of these class as keys in a Map and their salary as value

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class EmployeeClass {

    private String name;
    private int age;
    private String designation;

    public EmployeeClass(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDesignation() { return designation; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeClass emp = (EmployeeClass) o;
        return age == emp.age &&
                Objects.equals(name, emp.name) &&
                Objects.equals(designation, emp.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }

    @Override
    public String toString() {
        return name + " (" + age + ", " + designation + ")";
    }
}

class EmployeeMapDemo {

    public static void main(String[] args) {

        Map<EmployeeClass, Double> empSalaryMap = new HashMap<>();

        EmployeeClass e1 = new EmployeeClass("Himanshu", 23, "Java Developer");
        EmployeeClass e2 = new EmployeeClass("Badal", 25, "Backend Developer");
        EmployeeClass e3 = new EmployeeClass("Kartik", 22, "Frontend Developer");

        empSalaryMap.put(e1, 50000.0);
        empSalaryMap.put(e2, 60000.0);
        empSalaryMap.put(e3, 45000.0);

        for (Map.Entry<EmployeeClass, Double> entry : empSalaryMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Salary: " + entry.getValue());
        }

        EmployeeClass searchEmp = new EmployeeClass("Himanshu", 23, "Java Developer");
        System.out.println("\nHimanshu Salary: " + empSalaryMap.get(searchEmp));
    }
}
