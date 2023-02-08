package ReplitHW;

import java.util.Scanner;

public class D78 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();

        }
        for (int num:arr){
            System.out.println(num*10);
        }
}}
