package ReplitHW;

import java.util.Scanner;

public class D39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your mark");
        int score = sc.nextInt();
        if (score > 1 && score <= 25) {
            System.out.println("Your grade is F");
        } else if (score > 25 && score <= 45) {
            System.out.println("Your grade is E");
        } else if (score > 45 && score <= 50) {
            System.out.println("Your grade is D");
        } else if (score > 50 && score <= 60) {
            System.out.println("Your grade is C");
        } else if (score > 60 && score <= 80) {
            System.out.println("Your grade is B");
        } else if (score > 80) {
            System.out.println("Your grade is A");
        }else{
            System.out.println("Please enter valid mark");

             }
    }


    }

