package Homework15;

public class Task1 {
    // Create a method that will take 2 parameters as a numbers and prints which number is larger.
    int largestNum(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;

        }
    }


    public static void main(String[] args) {
        Task1 lager=new Task1();
        System.out.println(lager.largestNum(20,30));

    }
}