package HomeWork1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /* Write a program that will print whether it is a weekend or weekday.
        1-If any day from 1-5 → output “It is a weekday”,
        2-anyday from 6-7 → output  “It is a weekend”,
        3-any other day → output “Invalid day”
         */
        Scanner input = new Scanner(System.in);
        System.out.println("is it a weekend or weekday?");
        int day = input.nextInt();
        if ((day >= 1) && (day <= 5)) {
            System.out.println("It is a weekday");
        } else if
        ((day == 6) && (day == 7)) {
            System.out.println("It is a weekend");
        } else {
            System.out.println("Invalid day");


            int day1 = input.nextInt(); // Diff way to execute the code
            switch (day1) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("It is a weekday");
                    break;
                case 6:
                case 7:
                    System.out.println("It is a weekend");
                default:
                    System.out.println("Invalid day");


            }

        }
    }
}




