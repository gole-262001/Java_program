package javacode;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.Scanner;

public class Bubblesort {

   static void bubblesort(int[] arr , int n)
    {
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
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
        bubblesort(arr , n);

        for(int i = 0; i<n; i++) System.out.print(arr[i] +" ");


    }
}
