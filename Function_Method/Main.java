package Function_Method;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Q find the sum of two number
        Scanner in = new Scanner(System.in);
        int num1 , num2, sum;
        System.out.print("Enter the number 1: ");
        num1 = in.nextInt();
        System.out.print("Enter the number 2: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum : "+sum);

       /*

        System.out.println("The sum : "+sum);
        the + operator is used for String concatenation, not addition.

                How it works

        "The sum : " → this is a String

        sum → this is usually an int, double, or another variable

        When one operand is a String, Java automatically converts the other operand to a String and joins them together

        example:

        System.out.println(10 + 20);        // 30 (addition)
        System.out.println("10" + 20);      // 1020 (concatenation)
        System.out.println(10 + 20 + "A");  // 30A
        System.out.println("A" + 10 + 20);  // A1020

        */
    }
}
