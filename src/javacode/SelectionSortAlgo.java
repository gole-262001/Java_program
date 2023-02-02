package javacode;
import java.util.*;
import java.util.Scanner;

public class SelectionSortAlgo {
    public static void swap(int a , int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
   public static void selectionsort(int[] arr , int n)
    {
            for (int i = 0; i < n-1; i++)
            {
                int small = arr[i];
                for(int  j = i; j <n; j++)
                {
                    if(small > arr[j])
                    {
                        small = arr[j];
                    }
                }
                if(small == arr[i])
                {swap(small , arr[i]);}

            }
    }
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array you wants to sort ");
        n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n +" number");
        for(int i = 0; i <n; i++)
        {
            System.out.println("Enter the " +i +" number");
            arr[i] = s.nextInt();
        }
        for(int i = 0; i<n; i++) System.out.print(arr[i] +" ");
        System.out.println("\n");
        selectionsort(arr , n);

        for(int i = 0; i<n; i++) System.out.print(arr[i] +" ");


    }
}
