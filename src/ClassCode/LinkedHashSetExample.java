package ClassCode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set lhs = new LinkedHashSet();
        lhs.add(25);
        lhs.add(2);
        lhs.add(5);
        lhs.add(15);
        lhs.add(15); // duplicate is not allow in linkedhashset
        Iterator itr = lhs.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        lhs.remove(2);
        System.out.println(lhs);
        lhs.clear();
        System.out.println("Empty set" +lhs);
    }
}
