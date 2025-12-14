package SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruits = in.nextLine();
//        switch (fruits){
//            case "Mango":
//                System.out.println("Mango is king of fruits");
//                break;
//            case "orange":
//                System.out.println("Orange test will be sour");
//                break;
//            case "Grapes":
//                System.out.println("Grapes bunch test will be sweet ");
//                break;
//            case "Banana":
//                System.out.println("Banana favourite fruit of monkey ");
//                break;
//            default:
//                System.out.println("Invalid fruits");
//        }


//        switch (fruits) {
//            case "Mango" -> System.out.println("Mango is king of fruits");
//            case "orange" -> System.out.println("Orange test will be sour");
//            case "Grapes" -> System.out.println("Grapes bunch test will be sweet ");
//            case "Banana" -> System.out.println("Banana favourite fruit of monkey ");
//            default -> System.out.println("Invalid fruits");
//        }

        int day = in.nextInt();
//        switch (day){
//            case 1:
//                System.out.println("Sunday");
//                break;
//            case 2:
//                System.out.println("Monday");
//                break;
//            case 3:
//                System.out.println("Tuesday");
//                break;
//            case 4:
//                System.out.println("Wednesday");
//                break;
//            case 5:
//                System.out.println("Thursday");
//                break;
//            case 6:
//                System.out.println("Friday");
//                break;
//            case 7:
//                System.out.println("Saturday");
//                break;
//        }
//
//        switch (day) {
//            case 1 -> System.out.println("Sunday");
//            case 2 -> System.out.println("Monday");
//            case 3 -> System.out.println("Tuesday");
//            case 4 -> System.out.println("Wednesday");
//            case 5 -> System.out.println("Thursday");
//            case 6 -> System.out.println("Friday");
//            case 7 -> System.out.println("Saturday");
//        }

//        switch (day){
//            case 1:
//
//            case 2:
//
//            case 3:
//
//            case 4:
//
//            case 5:
//                System.out.println("Thursday");
//                break;
//            case 6:
//                System.out.println("Friday");
//                break;

//        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
        }
    }
}
