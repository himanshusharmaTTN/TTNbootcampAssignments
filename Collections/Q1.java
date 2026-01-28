import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ImplementingList
{
    static void main() {
        List<Float> list = new ArrayList<>();

        list.add(10.5f);
        list.add(20.2f);
        list.add(5.3f);
        list.add(7.0f);
        list.add(2.5f);

        Iterator<Float> it = list.iterator();
        float sum = 0;
        while(it.hasNext())
        {
            float x= it.next();
            sum+=x;
            System.out.println(x);
        }
        System.out.println("Sum is : "+sum);
    }
}
