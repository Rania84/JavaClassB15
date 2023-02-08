package ReplitHW;

import java.util.Scanner;

public class D105 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        word= word.replaceAll("[^aeiouuuuuAEIOU]","");
        System.out.println(word);
    }
}
