package javacode;

import java.util.Scanner;

public class InsertionSortAlgo {
    public static void insertionsort(int [] arr , int n)
    {
        for(int i = 1; i < n-1; i++)
        {
            int curr = arr[i];
            int j = i-1;
            while(j >= 0 && curr < arr[j])
            {
                    arr[j+1] = arr[j];
                    j--;
            }
            arr[j+1]= curr;

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
        insertionsort(arr , n);

        for(int i = 0; i<n; i++) System.out.print(arr[i] +" ");



    }
}
