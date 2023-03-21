package ReplitHW;

import java.util.LinkedList;

public class D190 {
    public static void main(String[] args) {


    LinkedList<Integer>fibonacci=new LinkedList<>();
    int number1=0;
    int number2=1;
    fibonacci.add(number1);
    fibonacci.add(number2);
    for(int i=0;i<=10;i++) {
        int number3 = number1 + number2;
        fibonacci.add(number3);
        number1 = number2;
        number2 = number3;
    }
    for (int fibonacciList:fibonacci){
        System.out.print(fibonacciList+" ");

    }
    }
    }