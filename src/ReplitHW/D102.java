package ReplitHW;

import java.util.Scanner;

public class D102 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        for (int i = 0; i < word.length(); i+=1) {

            System.out.println(word.charAt(i));
        }
    }
}
