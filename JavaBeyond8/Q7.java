// Q7. Use iterator stream method to generate a stream

import java.util.stream.Stream;

 class Ques7 {
    public static void main(String[] args) {

        Stream.iterate(1, n -> n <= 12, n -> n + 1)
                .forEach(System.out::println);
    }
}