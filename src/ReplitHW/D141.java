package ReplitHW;

public class D141 {
    public static int maxValue(int[] arr) {


        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr = {5, 12, -3, 7, 3, 22};
        System.out.println(maxValue(arr));
    }
}