package javacode;

// Perfect Number Program in Java

import java.util.Scanner;

public class P7 {
    public static void main(String arg[])
    {
        int num , num1 = 0 ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number ");
        num = s.nextInt();

        for(int i = 1; i < num; i++)
        {
            if(num % i == 0)
            {
                num1 = num1 + i;
            }
        }
        if(num1 == num)
        {
            System.out.println("perfect number");
        }
        else{
            System.out.println("not perfect number");
        }
    }
}
