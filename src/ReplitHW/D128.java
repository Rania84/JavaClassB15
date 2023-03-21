package ReplitHW;

public class D128 {
   public static String mixString (String s1,String s2){
       int length=s1.length();
       StringBuilder combind=new StringBuilder();
       for(int i = 0; i < length; i++) {
          combind.append(s1.charAt(i));
          combind.append(s2.charAt(i));
       }
       return combind.toString();
   }
   public static void main(String[] args){
      String firstValue = mixString("12345","abcde");
      System.out.println(firstValue);
      String secondValue = mixString("howdy","hello");
      System.out.println(secondValue);

   }
}
/*Create a static method with the following specification

Return Type: String

Method Name: mixString

Parameters:

- a String called s1
- a String called s2

Then inside method write logic that will return the strings combined, one letter at a time, starting with s1.  See example below for an example.

NOTE: s1 and s2 should be of equal lengths:

```
s1 ==> "12345"
```

```
s2 ==> "abcde"
```

```
mixString(s1,s2) ==> "1a2b3c4d5e"
```

*/