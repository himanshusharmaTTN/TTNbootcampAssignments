// Q4. Write a program to implement constructor reference
import java.util.function.Supplier;
import java.util.function.BiFunction;

class Student {

    String name;
    int age;

    Student() {
        System.out.println("No-arg constructor ");
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor ");
    }

    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

 class ConstructorReference {

    public static void main(String[] args) {

        Supplier<Student> s2 = Student::new;
        Student st2 = s2.get();

        BiFunction<String, Integer, Student> f2 = Student::new;
        Student st4 = f2.apply("Rahul", 24);
        System.out.println(st4);
    }
}
