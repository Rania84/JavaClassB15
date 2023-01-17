package HomeWork9;

public class Task5 {
    public static void main(String[] args) {
        //Create an array of size 5 on integers
        // and calculate the sum of all elements in an array.
        int sum = 0;
        int[] num = {20, 25, 30, 35, 40};

        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
            System.out.println(sum);

        }
}


