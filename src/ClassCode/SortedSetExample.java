package ClassCode;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Iterator;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet set = new TreeSet();
        set.add("HEllo");
        set.add("Arigato");
        set.add("Thanks you");
        set.add("Abhishek Gole");
        System.out.println("The list of elements is given as:");
        Iterator itr = set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        /*    -- Another method of iteration
        for (Object object : set) {
            System.out.println(object);
        }
         */

        System.out.println("The first element is given as: " + set.first());
        System.out.println("The last element is given as: " + set.last());
        System.out.println("The respective element is given as: " + set.headSet("Baleno"));
        System.out.println("The respective element is given as: " + set.tailSet("Audi"));
    }


}



