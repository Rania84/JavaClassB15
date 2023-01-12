package ReplitHW;

import java.util.Scanner;

public class D36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two strings");
        String w1 = sc.next();
        String w2 = sc.next();
        System.out.println("Please enter two numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if (n1 == n2  && w1.equals(w2)) {
            System.out.println("AND");}
        else if (n1 ==n2 || w1.equals(w2)) {
            System.out.println("OR");

        }else if (n1 != n2 && !w1.equals(w2))
                    System.out.println("NONE");
            }
        }



