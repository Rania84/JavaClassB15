package class3;

public class typeCasting5 {
    public static void main(String[] args) {
        long number=155;
        byte shorterNumber=(byte) number;
        float f=10.5f;
        int num=(int)f;
        System.out.println(shorterNumber);
        System.out.println(num);

        byte b=10;
        int number2= b;
        short c= (short) number2;
        System.out.println(b);

        float eggs= 12.5f;
        int wholePart= (int)eggs; // type casting we are converting from float to int.

        System.out.println(wholePart);

    }
}
