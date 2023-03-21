package ReplitHW;

import java.util.ArrayList;

public class D187 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        // add elements to the ArrayList
        list.add("hi");
        list.add("yo");
        list.add("sup");
        list.add("yolo");
        list.add("boop");
        // remove specific elements from the ArrayList
        list.remove(4);
        list.remove(2);
        list.remove(0);

        for(String words:list){

        System.out.print(words+" ");



    }
}}