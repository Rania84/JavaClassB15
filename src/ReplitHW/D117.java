package ReplitHW;

public class D117 {
    public static int sumEvenToX(int x) {
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            if (x % 2 == 0) {
                sum += i;
            }
        }
            return sum;

        }


        public static void main (String[]args){
            D117 d117 = new D117();
            System.out.println(d117.sumEvenToX(8));
        }
    }
