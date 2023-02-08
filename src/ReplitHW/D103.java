package ReplitHW;

import java.util.Scanner;

public class D103 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        for (int i = 0; i < s.length(); i+=1) {

            System.out.print(s.charAt(i)+" ");
        }
    }
}