package ReplitHW;

import java.util.Scanner;

public class D32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your gender: M or F");
        String gender = input.nextLine();
        System.out.println("Please enter your age");
        int age = input.nextInt();

        if (age > 25) {
            if (gender.equals("F")) {
                System.out.println("Woman");
            } else {
                System.out.println("Man");
            }
        }


                if (age < 25) {
                    if (gender.equals("F")) {
                        System.out.println("Girl");
                    } else {
                        System.out.println("boy");


                    }


                }
            }
        }







