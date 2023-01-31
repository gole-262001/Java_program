package javacode;

// Java Program to Check Prime Number or Not

import java.util.Scanner;

public class P3 {
    public static void main(String arg[])
    {
        int num , flag = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number ");
        num = s.nextInt();
        if(num == 1 || num == 2) System.out.println("Prime number");
        for(int i = 2; i < num/2; i++)
        {
            if(num % i == 0)
            {
                System.out.println("Not Prime");
                flag = 1;
                break;
            }
        }
        if(flag == 0) System.out.println("Prime Number");
    }
}
