package ReplitHW;

public class D69 {
    /*Write a program to print out the pattern:

**Expected output:**


1 2 3 4 5 6 7

1 2 3 4 5 6

1 2 3 4 5

1 2 3 4

1 2 3

1 2

1

1 2

1 2 3

1 2 3 4

1 2 3 4 5

1 2 3 4 5 6


```*/
    public static void main(String[] args) {
        for (int i = 8; i >=1; i--) {
            for (int j = 1; j < i; j++) {

            System.out.print(j+" ");

            }
            System.out.println();
            System.out.println();
        }
        for (int i = 2; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            System.out.println();


        }
    } }

