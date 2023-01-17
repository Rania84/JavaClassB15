package class8;

public class NestLoops7 {
    public static void main(String[] args) {
        for (int i = 1; i <=3 ; i++) {     // outerfor loop executes the below code 3 time
            for (int j=0; j <= 5; j++){// inner for loop prints the value of j from 1 to 5

                System.out.print(j*i+" " );


            }
            System.out.println("");

    }



            for (int i = 1; i <= 3; i++) {
                for (int j = 0; j <= 5*i; j+=i) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }

        }
    }






