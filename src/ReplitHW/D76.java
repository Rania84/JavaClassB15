package ReplitHW;

import class10.ScannerAndArrays;

import java.util.Scanner;

public class D76 {
    public static void main(String[] args) {
        String[] days = new String[7];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < days.length; i++) {
            System.out.println("Please enter day " + (i + 1) + " of the week:");
            days[i] = scanner.nextLine();
        }

       // System.out.println("Days of the week:");
        for (String day : days) {
            System.out.println(day);

        }
    }
}