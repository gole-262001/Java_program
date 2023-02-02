package javacode;

import java.util.Scanner;

public class KadaneAlgo {
    static long maxSubarraySum(int arr[], int n){

        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        for(int i = 0; i <n ;i++)
        {
            curr_sum += arr[i];
            if(curr_sum > max_sum) max_sum = curr_sum;
            if(curr_sum < 0)
            {
                curr_sum = 0;
            }
        }
        return max_sum;

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


        System.out.print(maxSubarraySum(arr , n));
    }
}
