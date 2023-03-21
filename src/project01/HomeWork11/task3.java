package project01.HomeWork11;

public class task3 {
    public static void main(String[] args) {
        /*Create a 2D array of integer values. Print the sum of all numbers. */
        int[][] arrays = {{10, 20, 30},
                {5, 15, 25},
                {20,25,35}
        };
        int sum = 0;
        for (int i=0;i<arrays.length;i++) {
            for (int j =0;j<arrays[i].length;j++) {
                sum += arrays[i][j];
            }
            }
                System.out.println(sum);

            }


        }





