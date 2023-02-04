 package Project;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean b = true;
        Double ans;
        ans = s.nextDouble();
        while (b) {

            char opr = s.next().charAt(0);

            if (opr == '+') {

                int num2 = s.nextInt();
                ans += num2;
                System.out.print(" = " +ans);

            }

            else if (opr == '-') {

                int num2 = s.nextInt();
                ans -= num2;
                System.out.print(" = " +ans);
            } else if (opr == '*') {

                int num2 = s.nextInt();
                ans *= num2;
                System.out.print(" = " +ans);
            } else if (opr == '/') {

                int num2 = s.nextInt();
                ans /= num2;
                System.out.print(" = " +ans);
            } else System.exit(0);


        }

    }
}
