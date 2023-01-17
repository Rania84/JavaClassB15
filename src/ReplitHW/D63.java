package ReplitHW;

import java.util.Scanner;

public class D63 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=0;
        int x;
        System.out.print("In: ");
        x = input.nextInt();
        for (i=0; x>i ; i++){
            System.out.print(i+" ");

    }

        Scanner fetch=new Scanner(System.in);
        System.out.println("Please Enter the number");
        int x1=fetch.nextInt();
        for (int i1 = 0; i1 < x1; i1++) {
            System.out.print(i1+" "); // print prints the numbers on the same line +" " adds space after each number
        }
        System.out.println();

}}
