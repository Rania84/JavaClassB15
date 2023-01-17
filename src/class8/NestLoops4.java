package class8;

public class NestLoops4 {
    public static void main(String[] args) {
        for (int i = 0; i <3 ; i++) {     // outerfor loop executes the below code 3 time
            for (int j = 1; j <= 5; j++){  // inner for loop prints the value of j from 1 to 5
                System.out.print(j+" " );

            }
            System.out.println();

    }
}}

