// Q2. Use Of method to create List, Set and Map

import java.util.*;

class Ques2 {
    public static void main(String[] args) {

        List<String> list = List.of("Himanshu", "Badal", "tania");

        System.out.println(list);

        Set<Integer> set = Set.of(10, 20, 30);

        System.out.println(set);

        Map<Integer, String> map = Map.of(
                1, "Himanshu",
                2, "Himans",
                3, "Him"
        );

        System.out.println(map);

    }
}
