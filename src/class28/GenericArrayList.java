package class28;



import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class GenericArrayList {
    public static void main(String[] args) {

        // ArrayList<String> name=new ArrayList<>();
        Object a=new String("Some value");

        Object c=new Scanner(System.in);

        ArrayList name=new ArrayList();
        name.add("Ehsan");
        name.add(10);
        name.add('a');

        for (Object j:name) {
            System.out.println(j);
        }
    }
}