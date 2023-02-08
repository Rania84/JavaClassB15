package ReplitHW;

import java.util.Scanner;

public class D34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num2 > num1) {
            if (num3 > num2)
                System.out.println("The largest number is " + num3);

        }
        if (num2 > num1) {
            if (num2 > num3)
                System.out.println("The largest number is " + num2);
        }
        if (num1 > num2) {
            if (num2 > num3)
                System.out.println("The largest number is " + num1);

        }
    }
}



