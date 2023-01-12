package Homework5;
/*Allow user to enter grade and then provide explanation:
A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable
. At the end your program should print which grade was entered by a user with explanation.
 */

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade");
        String grade = sc.next();
        switch (grade) {
            case "A":
            case "a":
                System.out.println(grade + "-Excellent");
                break;
            case "B":
            case "b":
                System.out.println(grade + "-good");
                break;
            case "c":
            case "C":
                System.out.println(grade + "Average");
            case "D":
            case "d":
                System.out.println(grade + "bad");
                break;
            default:
                System.out.println("this grade is not acceptable");
        }
    }
}
