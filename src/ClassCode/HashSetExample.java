package ClassCode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        Set s = new HashSet();
        s.add(2);
        s.add(5);
        s.add(9);
        s.add(2);
        Iterator itr = s.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println(s);

    }
}
