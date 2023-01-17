package HomeWork8;

import java.util.Scanner;

public class Task2 {
    // 2) Create a program that will be asking user to apply for a credit card 10 times.
    // As soon you get an “yes” from a user program should stop asking.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            System.out.println("would you like  to apply for a creitcrad ? ");

            String answer = input.nextLine();

            if (answer.equalsIgnoreCase( "yes")) {
                break;
            }


        }
    }
}