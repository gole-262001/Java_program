package javacode;

  //  Java Program to Check Alphabet

import java.util.Scanner;

public class P4 {
    public static void main(String arg[])
    {
        char ch ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the character");
        ch = s.next().charAt(0);

        if(ch > 'A' && ch < 'Z' || ch >'a' && ch < 'z')
        {
            System.out.println("Character is Alphabet");
        }else{
            System.out.println("Character is not Alphabet");

        }

    }
}
