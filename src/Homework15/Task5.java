package Homework15;

public class Task5 {
    //Write a method to return
    // whether given number is prime or not?
    // return= boolean
    //parameter= int && if

    boolean isPrime(int a) {
        boolean flag = true;
        if (a > 1) {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    flag = false;
                    break;
                }
            }

        } else {
            flag = false;
        }
        return flag;

    }

    public static void main(String[] args) {
        Task5 prime=new Task5();
        System.out.println(prime.isPrime(8));
    }
}






