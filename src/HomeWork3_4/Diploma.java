package HomeWork3_4;

public class Diploma {
    public static void main(String[] args) {
        /*
      Write a program to store a boolean value of whether user has diploma or not.
      If user has a diploma, you should say congratulations, otherwise program should suggest to
     get a degree. Then if user has a degree program should check a gpa score. If gpa score is higher
      or equals to 3.5 → output should say “You are eligible for scholarship”,
    otherwise → “You should have studied harder” .

         */
        boolean diploma = true;
        double gps = 4.5;
        if (diploma == true) {
            System.out.println("Congratulations");
        } else if (gps<=3.5) {
            System.out.println("suggest to get a degree");
        } else if (gps>=3.5) {
            System.out.println("You are eligible for scholarship");
        }else {
            System.out.println("You should have studied harder");

        }

    }



    }



