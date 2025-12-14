package Conditional;

import java.util.Scanner;

public class Largest   {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int maxi = Integer.MIN_VALUE;
        for(int i = 0 ; i < n; i++){
            int x = input.nextInt();
            if(x >= maxi){
                maxi = x;
            }
        }
        System.out.println(maxi);
    }
}
