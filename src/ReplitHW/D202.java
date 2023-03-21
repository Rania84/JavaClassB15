package ReplitHW;

import java.util.LinkedHashMap;
import java.util.Map;

public class D202 {
    public static void main(String[] args) {
        Map<String,String>fruits=new LinkedHashMap<>();
        fruits.put("1 item","apple");
        fruits.put("2 item","banana");
        fruits.put("3 item","pear");
        fruits.put("4 item","tomato");
        fruits.put("5 item","mango");
        fruits.put("6 item","kiwi");
        for (String itemNum: fruits.keySet()){
            String value=fruits.get(itemNum);

           System.out.println("Key is "+itemNum+" and values is "+value);
        }
    }
}
