package ReplitHW;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner shapes= new Scanner(System.in);
        System.out.println("Please enter the length");
        int length = shapes.nextInt();
        System.out.println("please enter the width");
        int width= shapes.nextInt();
        if (length>width)
        {
            System.out.println("The shape of your object is rectangle");}
        else{
            System.out.println("The shape of your object is square");
        }

    }
}
