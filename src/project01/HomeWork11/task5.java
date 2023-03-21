package project01.HomeWork11;

public class task5 {
    public static void main(String[] args) {
      /*  Create a 2D array of integers.
       Develop a program which will calculate the sum of even and  odd numbers for that array.
       */
        int[][] arry = {{2, 3, 4, 5},
                {6, 8, 11, 12},
                {23, 24, 25, 26}
        };
        int sum = 0;
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry[i].length; j++)
                if (arry[i][j] % 2 == 0) {
                    sum +=  arry[i][j];
                }
        }
        System.out.println("The total sum of even: "+sum);


        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry[i].length; j++)
                if (arry[i][j] % 2 != 0) {
                    sum += arry[i][j];
                }
        }
                    System.out.println("The total sum of odd: "+sum);

        /*int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    sumEven += arr[i][j];
                } else {
                    sumOdd += arr[i][j];
                }
            }
        }
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    */
                }

        }
