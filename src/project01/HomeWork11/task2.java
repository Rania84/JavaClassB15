package project01.HomeWork11;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        /*Using Scanner create an array of countries.
         When an array is created,
         retrieve all values from it and while retrieving those values print capital for each country.
          (use 2 different loops)
         */
        Scanner sc = new Scanner(System.in);
        String[] countries = new String[4];

        for (int i = 0; i < countries.length; i++) {
            System.out.println("Enter the country");
            countries[i] = sc.next();
            switch (countries[i]) {
                case "India":
                    System.out.println("Capital of " + countries[i] + " is New Delhi");
                    break;
                case "USA":
                    System.out.println("Capital of " + countries[i] + " is Washington, D.C.");
                    break;
                case "China":
                    System.out.println("Capital of " + countries[i] + " is Beijing");
                    break;
                case "Russia":
                    System.out.println("Capital of " + countries[i] + " is Moscow");
                    break;
                default:
                    System.out.println("Capital of " + countries[i] + " is not known");


            }
        }
    }}
