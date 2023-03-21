package review001;

import java.util.HashMap;
import java.util.Map;

public class EntryDemo02 {
    public static void main(String[] args) {
        Map<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Soap",12.5);
        fruitMap.put("Banana",4.9);
        fruitMap.put("Dragon Fruit",5.6);
        fruitMap.put("pear",16.5);
        fruitMap.put("Orange",15.5);
        fruitMap.put("Mango",10.6);
        fruitMap.forEach((key,value)-> System.out.println(key+" "+value));// for print it in one line

        fruitMap.entrySet().removeIf(x->(x.getKey().contains("a")||x.getKey().contains("e"))&&x.getValue()>8);
        System.out.println(fruitMap);
        }
}
