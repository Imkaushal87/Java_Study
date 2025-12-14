package Conditional;

import java.util.Scanner;

public class Fibo {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a =0;
        int b = 1;
        int count = 2;
        int n = input.nextInt();
        int sum = 0;
        while(count <=n){
            sum = a + b;
            a = b;
            b = sum;
            count++;
        }

        System.out.println(sum);

    }
}
