// Q5. Implement following functional interfaces from java.util.function using lambdas:
//1. Consumer
//2. Supplier
//3. Predicate
//4. Function

import java.util.function.*;

class FunctionalInterfaces {

    public static void main(String[] args) {

        Consumer<String> consumer = s ->System.out.println("Consumer output: " + s);
        consumer.accept("Hello Java");

        Supplier<Double> supplier = () -> Math.random();
        System.out.println("Supplier output: " + supplier.get());

        Predicate<Integer> predicate = n -> n > 18;
        System.out.println("Predicate output (age > 18): " + predicate.test(20));

        Function<String, Integer> function = s -> s.length();
        System.out.println("Function output (length): " + function.apply("Himanshu"));
    }
}
