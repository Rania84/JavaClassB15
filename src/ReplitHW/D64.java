package ReplitHW;

import java.util.Scanner;

public class D64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the ending number");
        int userInput = scanner.nextInt();

        for (int i = 0; i < userInput * 2; i++) {
            System.out.println(i);
        }
        int userInput2 = scanner.nextInt();
        for (int i = 0; i < userInput2 * 2; i++) {
            System.out.println(i);
        }
        int userInput3 = scanner.nextInt();
        for (int i = 0; i < userInput3 * 2; i++) {
            System.out.println(i);
        }
    }
}

