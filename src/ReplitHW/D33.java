package ReplitHW;

import java.util.Scanner;

public class D33 {
    public static void main(String[] args) {
        Scanner myPut = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = myPut.nextInt();
        if (num % 2 == 0) {
            System.out.println("Value is even");
            if (num > 1000) {

                System.out.println("Even value is large");
            }else{
                System.out.println("Even value is just right");
            }
        }

        if (num%2!= 0) {
            System.out.println("Value is odd");
            if (num >1000) {
                System.out.println("odd value is just right");
            }else{
                System.out.println("Odd value is just right");
            }

        }

    }

}


