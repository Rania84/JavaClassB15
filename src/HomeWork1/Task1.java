package HomeWork1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        Prompt the user to enter person heights in inches. Person should be classified as one of the following:
• short (under 60 inch)
• medium(between 60 -72 inch)
• tall (over 72 inch)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter your heightn inches");
        int H = sc.nextInt();
        if (H < 60) {
            System.out.println("short");
        } else if ((H >= 60) && (H <= 72)) {
            System.out.println("Medium");
        } else if (H > 72) {
            System.out.println("tall");

        }


    }
}


