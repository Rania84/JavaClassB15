package Homework5;


/*)Write a program to find largest number among three numbers using nested if provided by a user (numbers must be distinct)
 */


import java.util.Scanner;

public class Task6 {
        public static void main(String [] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("please enter three numbers distinct");
            int num1= input.nextInt();
            int num2= input.nextInt();
            int num3= input.nextInt();

            if(num1>num2){
                if(num1>num3){
                    System.out.println("the largest number is "+num1);
                }
            }
            if (num2>num1){
                if (num2>num3){
                    System.out.println("the largest number is "+ num2);
                }
            }
            if (num3>num1){
                if (num3>num2){
                    System.out.println("the largest number is "+ num3);
                }
            }


        }
}
/*  public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("1st Number : ");
        double a= scan.nextDouble();
        System.out.print("2nd Number : ");
        double b= scan.nextDouble();

        System.out.println("What operation do you want to do with them?");
        System.out.println("1. Add them (+)");
        System.out.println("2. Subtract them (-)");
        System.out.println("3. Multiply them (*)");
        System.out.println("4. Divide them (/)");

        String opt= scan.next();

        if (opt.equals("1")||opt.equals("Add")||opt.equals("+")){
            System.out.println("You chose to add them and your answer is : "+(a+b));
        }else if (opt.equals("2")||opt.equals("Subtract")||opt.equals("-")){
            System.out.println("You chose to subtract them and your answer is : "+(a-b));
        }else if (opt.equals("3")||opt.equals("Multiply")||opt.equals("*")){
            System.out.println("You chose to multiply them and your answer is : "+(a*b));
        }else if (opt.equals("4")||opt.equals("Divide")||opt.equals("/")){
            System.out.println("You chose to divide them and your answer is : "+(a/b));
        }else {
            System.out.println("Invalid Input!");
        }
*/





