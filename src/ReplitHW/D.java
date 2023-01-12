package ReplitHW;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner xo=new Scanner(System.in);
        System.out.println("Please enter first number");
        int x = xo.nextInt();
        System.out.println("please  enter second number");
        int y= xo.nextInt();
        int w=(x*y);

        if(w>0){
        System.out.println(true );
        }
        else {
            System.out.println(false);
        }




    }
}
