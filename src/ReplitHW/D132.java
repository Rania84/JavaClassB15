package ReplitHW;

public class D132 {
    public static int[][] reduce10 ( int[][] nums){
        int rows = nums.length;
        int columns = nums[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = nums[i][j] - 10;
            }
        }
        return result;
    }




    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7}
        };
        reduce10(a);
        int[][] result = reduce10(a);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");


            }
                System.out.println();


            }


        }
    }