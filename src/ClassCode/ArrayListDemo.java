package ClassCode;

import java.util.ArrayList;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List arrayList = new ArrayList<String>();
        arrayList.add("Abhishek");
        arrayList.add("Rohan");
        arrayList.add("Anil");
        arrayList.add("Shubham");

            System.out.println(arrayList); // anothe method to print List
            for(int i = 0; i <arrayList.size(); i++)
            {
                System.out.println(arrayList.get(i));
            }
            List arrayList1 = new ArrayList<String>();
        arrayList1.add("Utkarsh");
        arrayList1.add("Aditya");
        arrayList1.add("Harshit");
        arrayList1.add("Yogesh");
        arrayList.addAll(arrayList1); // add arraylist1 to arraylist2
         System.out.println(arrayList);
         arrayList.remove(2);
        System.out.println(arrayList);
        arrayList.add(1 , "yaswanth");
        System.out.println(arrayList);
        arrayList1.clear();
        System.out.println("List is empty "+arrayList1);



    }





}
