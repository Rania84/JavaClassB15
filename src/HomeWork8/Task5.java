package HomeWork8;

public class Task5 {
    public static void main(String[] args) {
        /* Print the following pattern:
55555
4444
333
22
1

         */

        for (int i = 1; i < 6; i-=1) {
            for (int j = 1; j < 5; j+=i*1) {
                System.out.print(i );
            }
          /* for (int i=1;i <11; i++){
                for(int j=1*i;j<11;j++)
                    System.out.print(j+" ");
                System.out.println();*/
            }
        }
    }

