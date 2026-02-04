// Q10. Demonstrate the use of  addFirst(), addLast, removeFirst(), removeLast, getFirst(), getLast(), reversed() in Set and List Sequenced collections

import java.util.ArrayList;
import java.util.List;

class Ques10 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.addFirst(5);
        list.addLast(40);

        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.removeFirst();
        list.removeLast();

        System.out.println(list);

        System.out.println(list.reversed());
    }
}