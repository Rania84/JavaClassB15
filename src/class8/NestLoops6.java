package class8;

public class NestLoops6 {
    public static void main(String[] args) {
        for (int i = 0; i <3 ; i++) {     // outerfor loop executes the below code 3 time
            for (int j = i; j <= 5; j++){// inner for loop prints the value of j from 1 to 5

                System.out.print(j+" " );


            }
            System.out.println();

    }




        for (int i =0; i<3; i++){
            if (i==0){
                for (int j =0; j<=5; j++){
                    System.out.print(j+" ");
                }
            }else if (i==1){
                for (int j =1; j<=5; j++){
                    System.out.print(j+" ");
                }
            }else if (i==2){
                for (int j =2; j<=5; j++){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }

}

