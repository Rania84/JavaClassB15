package Homework5;

import java.util.Scanner;
/*  Write a program to find largest of three double values
using if-else..if and logical operators provided by a user
 (numbers must be distinct)

*/
public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter 3 numbers");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();


        if (number1 > number2 && number2 > number3) {
            System.out.println( " is the largest number"+number1);
        } else if (number2 > number3 && number2 > number1) {
            System.out.println( " is the largest number"+number2);
        } else if (number3 > number2 && number3 > number1) {
            System.out.println( " is the largest number" + number3);
        }
    }
}
