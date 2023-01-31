package javacode;

import java.util.Scanner;
// Java Program to find even number in a array
public class P2 {
    public static void main(String arg[])
    {
            int arr[]= {1,2,56,3,45,2,4,7};
            for(int i =0 ; i <arr.length; i++)
            {
                if(arr[i] %2 ==0)
                {
                    System.out.println(arr[i]);
                }
            }
    }
}
