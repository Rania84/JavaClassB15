package HomeWork9;

public class Task1 {
    public static void main(String[] args) {
        /* Create an array of chars
        and store grades into it: A,B,C,D,E,F.
         Then print a grade B
          (use 2 different ways of creating an array).
         */
        char[] grades={'A','B','C','D','E','F'};
        System.out.println(grades[1]);

        System.out.println("*************");

        char[] grade={'A','B','C','D','E','F'};
        for (int i =0; i<grade.length;i++){
            if (grade[i]=='B'){
                System.out.println(grade[i]);
            }
        }
    }

}


