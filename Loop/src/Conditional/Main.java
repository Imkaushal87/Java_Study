package Conditional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Take the salary as input : ");
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        if(salary <= 25000){
            System.out.println("your ctc around 3.6 lpa  " +salary);
        }else if(salary > 25000 && salary <= 50000){
            System.out.println("your ctc around 4 t0 8 lpa"+ salary);
        }else{
            System.out.println("your ctc I don't no");
        }
    }
}