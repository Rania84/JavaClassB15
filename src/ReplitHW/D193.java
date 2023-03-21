package ReplitHW;

import java.util.LinkedList;

public class D193 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        list.add(555);
        list.add(666);

        int sum=0;
        for (int i: list){
            sum+=i;
        }
        System.out.println("Result of sum is " +sum);


    }
}