package HomeWork12;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

    /*Write a program that reads two people's first
    names and if they expecting boy or girl?
    Based on the input suggests a name for a baby:
    Example Output:
    Mom’s first name? Mary
    Dad’s first name? Daniel
    Boy or Girl? boy
    Suggested baby name: DANRY
    Example Output:
    Mom’s first name? Mary
    Dad’s first name? Daniel
    Boy or Girl? girl
    Suggested baby name: MAIEL */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Mom’s first name?" );
        String momName =input.nextLine();
        System.out.println(" Enter Dad’s first name?");
        String dadName =input.nextLine();
        System.out.println("Boy or Girl?");
        String gender  =input.nextLine();
        String suggestedName = "";
        if (gender.equalsIgnoreCase("boy")) {
            suggestedName = dadName.substring(0,3) + momName.substring(momName.length()-2);
        } else if (gender.equalsIgnoreCase("girl")) {
            suggestedName = momName.substring(0,2) + dadName.substring(dadName.length()-3);
        }

        System.out.println("Suggested baby name: " +suggestedName.toUpperCase());
    }
}

