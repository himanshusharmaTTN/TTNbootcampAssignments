import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
interface AA{
   default void add()
   {
       System.out.println("hello");
   }
}
interface BB{
    default void add() {
        System.out.println("Ho");
    }
}
class CC implements AA,BB
{

    @Override
    public void add() {
        BB.super.add();
        AA.super.add();
    }
}
class ACD{
    static void main() {
        CC o=new CC();
        o.add();
//        List<Integer> l = Arrays.asList(1,2,3,4,5);
//        System.out.println(l.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst());
//        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
//
//        // Row 1
//        ArrayList<Integer> row1 = new ArrayList<>();
//        row1.add(1);
//        row1.add(2);
//        row1.add(3);
//
//        // Row 2
//        ArrayList<Integer> row2 = new ArrayList<>();
//        row2.add(4);
//        row2.add(5);
//        row2.add(6);
//
//        // Row 3
//        ArrayList<Integer> row3 = new ArrayList<>();
//        row3.add(7);
//        row3.add(8);
//        row3.add(9);
//
//        // Add rows to matrix
//        matrix.add(row1);
//        matrix.add(row2);
//        matrix.add(row3);
//
//        matrix.stream().flatMap(x->x.stream()).forEach(System.out::println);
    }
}