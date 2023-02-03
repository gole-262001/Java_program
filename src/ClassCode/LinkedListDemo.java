package ClassCode;
import java.util.List;
import java.util.LinkedList;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class LinkedListDemo {
    public static void main(String[] args) {
        List ll = new LinkedList<Integer>();
        ll.add(22);
        ll.add(55);
        ll.add(55);
        ll.add(5);
        for(int i = 0; i < ll.size(); i++)
        {
            System.out.println(ll.get(i));
        }
        ll.remove(2);
        System.out.println(ll);
        ll.clear();
        System.out.println("Linked List is empty " +ll);
        ll.add(12);
        ll.add(12);
        ll.add(12);
        ll.add(1 , 55);
        System.out.println(ll);
        List ll1 = new LinkedList<Integer>();
        ll1.add(52);
        ll1.add(52);
        ll1.add(52);
        ll.add(ll1);
        System.out.println(ll);
        Iterator<Integer> itr=ll.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        




    }




}
