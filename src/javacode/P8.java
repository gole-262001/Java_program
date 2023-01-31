package javacode;

// Java Program to Find Factorial of a Number

import java.util.Scanner;

public class P8 {
    public static void main(String[] args){

        int num , num1 = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number ");
        num = s.nextInt();
        if(num == 0) System.out.println(num);
        while(num > 0)
        {
            num1 = num *num1;
            num--;
        }
        System.out.println(num1);

    }

}
