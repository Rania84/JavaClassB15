package class28;

import java.util.LinkedList;

public class LinkedListsDemo {
    public static void main(String[] args) {
        LinkedList<String>names=new LinkedList<>();
        names.add("ArtemD");
        names.add("RoRo");
        names.add("Nana");
        names.add("Memo");
        for (String c :names) {
            System.out.println(c);
        }
    }
}
