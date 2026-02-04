//Q1. Convert an Optional type into Stream

import java.util.List;
import java.util.Optional;
import java.util.stream.*;

 class Ques1 {
    public static void main(String[] args) {
        Optional<Integer> opt = Optional.of(50);

        List<Integer> ans = opt.stream().toList();
        System.out.println(ans);
    }
}