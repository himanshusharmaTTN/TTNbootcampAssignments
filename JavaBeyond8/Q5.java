import java.util.function.Supplier;
import java.util.function.BiFunction;

class Stud {

    String name;
    int age;

    Stud() {
        System.out.println("No-arg constructor called");
    }

    Stud(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called");
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

 class Qs5 {

    public static void main(String[] args) {

        // No-arg constructor reference
        Supplier<Stud> s1 = Stud::new;
        Stud st1 = s1.get();

        // Parameterized constructor reference
        BiFunction<String, Integer, Stud> s2 = Stud::new;
        Stud st2 = s2.apply("Himanshu", 22);

        System.out.println(st2);
    }
}
