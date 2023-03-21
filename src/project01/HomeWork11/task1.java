package project01.HomeWork11;

import java.util.Scanner;

public class task1 {
    /*Using Scanner create an array of integer values.
     After the array is created, calculate
     the sum of all stored elements in that array
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int[] nums = new int[5];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            sum+= nums[i];
        }
            System.out.println(sum);
        }
    }

