package javacode;

import java.util.Scanner;
// Add Two Numbers in Java using Scanner :
public class P1 {
    public static void main(String arg[])
    {
        int a , b ,sum;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        a = s.nextInt();
        System.out.print("Enter the Second Number: ");
        b = s.nextInt();
        sum = a+b;
        System.out.println("The sum of two no. is " +sum);
    }
}
