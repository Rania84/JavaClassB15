package ReplitHW;

import java.util.Scanner;

public class D100 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
       for (int i=s.length()-1;i>=0;i--){
           System.out.println(s.charAt(i) );
       }
    }
}