package ReplitHW;

import java.util.HashSet;

public class D195 {
    public static void main(String[] args) {
        HashSet<Integer> list=new HashSet<>();
        list.add(111);
        list.add(111);
        list.add(111);
        list.add(999);
        list.add(999);
        list.add(999);
        for (Integer printList: list){
            System.out.println(printList);
        }
    }

    }

