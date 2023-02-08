package ReplitHW;

import class10.ScannerAndArrays;

import java.util.Scanner;

public class D104 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] name = new String[5];

        for (int i = 0; i < name.length; i++) {
            name[i] = input.nextLine();
            if (name.length >= 3) {


                System.out.println(name[i].substring(0, 3) + " ");

            }
        }
    }}