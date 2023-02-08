package ReplitHW;

import java.util.Arrays;

public class D93 {
    public static void main(String[] args) {
        String str = "abracadabra alakazam";
        String target1 = "dab";
        String target2 = "ABRA";

        System.out.println(str.indexOf("c"));
        System.out.println(str.indexOf(" "));
        System.out.println(str.indexOf(target1));
        System.out.println(str.indexOf(target2));

          // this is diff way to solve it .
        for (String s : Arrays.asList("c", " ", target1, target2)) {
            System.out.println(str.indexOf(s));

        }
    }
}