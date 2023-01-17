package class8;

public class NestLoops1 {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {     // outerfor loop
            for (int j = 0; j < 5; j++){  // inner for loop
                System.out.println("i= "+j+"j= "+j);
            }
            System.out.println("***************");
        }
    }
}
