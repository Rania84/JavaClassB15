package ReplitHW;

public class D114 {
    void add (int num1,int num2) {
        System.out.println("Addition " + (num1 + num2));
    }
        void multi(int num1,int num2){
            System.out.println("Multiplication "+(num1*num2));

    }
    void sub(int num1,int num2) {
        System.out.println("Subtraction " + (num1 - num2));
    }


        public static void main (String[]args){
            D114 newNumbers = new D114();
            newNumbers.add(10, 30);
            newNumbers.multi(3,10);
            newNumbers.sub(30,10);
        }
    }
