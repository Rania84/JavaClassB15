package ReplitHW;

import java.util.ArrayList;
import java.util.Scanner;

public class D188 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        Scanner input=new Scanner(System.in);
        for (int i=0;i<5;i++){
            int number=input.nextInt();
            list.add(number);
        }

        for(int i=0; i< list.size();i++)
        System.out.print(list.get(i)+" ");
    }
}
