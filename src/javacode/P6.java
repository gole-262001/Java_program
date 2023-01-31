package javacode;

//Java Program to Check Original equal to it's Reverse or Not

import java.util.Scanner;

public class P6 {
    public static void main(String arg[])
    {
        int num ;
        int num1 = 0;
        Scanner  s = new Scanner(System.in);
        System.out.println("Enter the Number ");
        num = s.nextInt();
        int num2 = num;

        while(num > 0)
        {
            num1  = num1 *10 + num % 10;
            num = num/10;
        }
        if(num2 == num1)
        {
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is not palindrome");
        }


    }
}
