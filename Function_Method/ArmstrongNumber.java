package Function_Method;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isArmstrongNumber(n);
        System.out.println(ans);
    }
    static boolean isArmstrongNumber(int n){
        long rev = 0,digit;
        long k = n;
        while(n != 0 ){
            digit = n %10;
            rev = rev + digit * digit *digit;
            n = n/10;
        }
        if(rev == k){
            return true;
        }
        return false;
    }
}
