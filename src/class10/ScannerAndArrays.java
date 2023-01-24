package class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter 5 numbers");

                int[] numbers= new int[5];

               /* numbers[0]=40; bellow code store numbers
                  numbers[1]=50;
              numbers[2]=60;
                    numbers[3]=70;
                numbers[4]=80;*/

       /* numbers[0]=sc.nextInt();
        numbers[1]=sc.nextInt();
        numbers[2]=sc.nextInt();
        numbers[3]=sc.nextInt();
        numbers[4]=sc.nextInt();*/
        // Below code uses a normal for loop to ask the user for numbers and
        // store them in the array.
        for(int i=0; i<numbers.length;i++) {
            numbers[i] =sc.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        }
    }


