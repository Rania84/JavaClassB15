package class8;

public class NestLoops2 {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {     // outerfor loop
            for (int j = 0; j < 5; j++){  // inner for loop
                if(j==1||j==2){
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
             /* or (int i = 0; i <5 ; i++) {     // outerfor loop
            for (int j = 0; j < 5; j++){  // inner for loop
                if(j==1||j==2){
                    System.out.println("");
                }
                System.out.print("*");
            }
            System.out.println(); */
