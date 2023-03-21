package ReplitHW;

import java.util.HashSet;

public class D196 {
    public static void main(String[] args) {
        HashSet<String> list=new HashSet<>();
        list.add("third");
        list.add("first");
        list.add("second");
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
