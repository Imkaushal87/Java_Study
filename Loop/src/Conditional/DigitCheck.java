package Conditional;

import java.util.Scanner;

public class DigitCheck {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int digit = input.nextInt();
        int count = 0;
        while(n != 0){
            if(n%10 == digit){
                count++;
            }
            n = n /10;
        }
        System.out.println(count);
    }
}