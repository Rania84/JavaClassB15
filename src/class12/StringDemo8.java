package class12;

public class StringDemo8 {
    public static void main(String[] args) {

        String str="Java is love";
        char c=str.charAt(2);
      /*  System.out.println(c);

        for (int i = 0; i <str.length() ; i++) {
            char ca=str.charAt(i);
            System.out.println(str.charAt(i));
        }*/
        System.out.println("*****");
        int counter=0;

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if(str.charAt(i)=='a'){
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println("Letter a appears "+counter+" times");

    }}