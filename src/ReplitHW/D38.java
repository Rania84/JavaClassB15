package ReplitHW;

import java.util.Scanner;

public class D38 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Is it weekend ?");
        boolean i= sc.nextBoolean();

        if (!i) {
            System.out.println("Today you will be learning manual testing");
        }else{
            System.out.println("Today you will be learning Java");
        }
    }
}
