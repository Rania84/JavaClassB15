package ReplitHW;

import java.util.Scanner;

public class D99 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();
        givenString = givenString.replaceAll("\\s", "").toLowerCase(); // removing spaces and converting to lowercase
        String reversedString = new StringBuilder(givenString).reverse().toString();  // reversing the string
        if (givenString.equals(reversedString)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

