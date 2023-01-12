package Homework5;

import java.util.Scanner;

/*
Using scanner class create calculator. Allow user to enter 2 numbers
 and operator(+,-,*,/). Based on operator provide the result to user
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the operation numbers");
        int n1=input.nextInt();
        int n2=input.nextInt();
        System.out.println("please Enter an operator (+:-:*:/) ");
        char operator= input.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println(n1+n2);
                break;
            case '-':
                    System.out.println(n1-n2);
                break;
            case '*':
                System.out.println(n1*n2);
                break;
            case '/':
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("Invalid input,Try again!");
        }


    }
}
