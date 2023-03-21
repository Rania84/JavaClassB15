package project01.HomeWork11;

public class task4 {
    /*Create a 2D array or integer type where you will store odd and even numbers.
    Develop a program which will identify/print the even numbers only.
     */
    public static void main(String[] args) {
        int[][] arry = {{2, 3, 4, 5},
                {6, 8, 11, 12},
                {23, 24, 25, 26}
        };
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry[i].length; j++)
                if (arry[i][j] % 2 == 0) {
                    System.out.println(arry[i][j]);
                }
        }
        //this is with  Enhanced
       /* for (int[] numbers : arry) {
            for (int j = 0; j < numbers.length; j++)
                if (numbers[j] % 2 == 0) {
                    System.out.println(numbers[j]);*/
    }
}