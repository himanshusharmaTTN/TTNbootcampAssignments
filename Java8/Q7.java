// Q7. Sum all the numbers greater than 5 in the integer list using streams

import java.util.*;

 class StreamSum {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 4, 6, 8, 3, 10, 1, 7);

        int sum = list.stream()
                .filter(n -> n > 5)
                .mapToInt(n -> n)
                .sum();

        System.out.println("List: " + list);
        System.out.println("Sum of numbers greater than 5 = " + sum);
    }
}
