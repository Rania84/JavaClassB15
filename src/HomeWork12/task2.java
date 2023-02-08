package HomeWork12;

import javax.swing.*;

public class task2 {
    public static void main(String[] args) {
        //Create a String and print it in reverse order (Sunday → yadnuS)

        String original = "Sunday";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println(reversed);
        for (int i=5; i>=0;i--){
            System.out.println(original.charAt(i));


        }
    }

    }


