package class8;

public class NestLoops3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {     // outerfor loop

                if(i==1){
                    System.out.print(" ");
                    continue;
                }
                 for (int j=0;j<5;j++){  // inner for loopcon

                     System.out.println("*");
                 }
                System.out.println();
            }
        }
    }
