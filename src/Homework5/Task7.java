package Homework5;

import java.util.Scanner;

//Ask user to enter their country and capture it.
// Once values are captured print which language user speaks.
public class Task7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your country");
        String country= sc.next();
        switch (country){
            case "Egypt":
                System.out.println("Arabic");
                break;
            case "USA":
                System.out.println("English");
                break;
            case "Paris":
                System.out.println("France");
            case "Roma":
                System.out.println("Italy");
                break;
            case "Mexico":
                System.out.println("Spanish");




        }



    }

}
