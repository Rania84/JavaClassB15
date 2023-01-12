package ReplitHW;

import java.util.Scanner;

public class D37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean i = sc.nextBoolean();

        System.out.println("Are you sleepy?");
        boolean f = sc.nextBoolean();

        if (i && !f) {
            System.out.println("Looks like you need to drink water");
        } else if (i && f) {
            System.out.println("Looks like you need to drink coffee");

        } else if (!i && !f) {
            System.out.println("Looks like you need to drink tea");
        }else{
            System.out.println("Looks like you need to drink nothing");
        }
    }
}



