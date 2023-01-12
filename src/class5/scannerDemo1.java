package class5;

import java.util.Scanner;

public class scannerDemo1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        /*System.out.println("please enter your age");
        int age= scan.nextInt();
        System.out.println("you are "+age+"years old");
        System.out.println("please enter your weight ");
        double weight =scan.nextDouble();
        System.out.println("your weight is"+weight+" Kgs");
        boolean hungry=scan.nextBoolean();
        System.out.println("hungry"+hungry);
*/
        System.out.println("please enter your gender");
        char gender=scan.next().charAt(0);

        System.out.println("please Enter your name");
        String name= scan.next();
        System.out.println("your name is "+ name);

        scan.nextLine(); // trick to make next line method after we have used any other method from
        System.out.println("please Enter your full name ");
        String fullName=scan.nextLine();
        System.out.println("your full name is"+fullName);
        scan.close();//Good practice


    }
}
