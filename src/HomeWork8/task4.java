package HomeWork8;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        /*1-Write a program to ask a user--> scanner
        2-  enter item they want to buy -->sout (enter the item...)
          and the price of that item -->sout ( )
       3-  Every time user enters money accumulate the amount -->sout (how much total ...?)
          4-how much is left to pay off.--> if()  && sout()
         If user give more money program should return a change.--> else if() && sout ()
         5- Whenever a user done with payments program should say "Thank you for shopping!"*/
        Scanner scanner = new Scanner(System.in);
        double totalPrice=0;
        for (int i = 0; i < 3; i++) {

            System.out.println("Please Enter the item and its price");
            String itemName = scanner.next();
            double itemPrice = scanner.nextDouble();
            totalPrice=totalPrice+itemPrice;
            System.out.println("This is the totalPrice amount that you have to pay "+totalPrice);
        }
        System.out.println("Please pay for the items");
        double amountPaid=scanner.nextDouble();

        if(amountPaid>totalPrice) {
            double chang = amountPaid - totalPrice;
            System.out.println("Hey here is your change " + chang);
        } else if (amountPaid<totalPrice) {
            System.out.println("you can't buy all the items");

        }

        System.out.println("Thank you for shopping!");

    }
}

