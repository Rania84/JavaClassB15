package Homework15;

public class Task3 {
    //Create a method that will print whether given String is palindrome or not.
    //return= string
    //name palindroma
    // parameterstring
   /* String palindroma(String name) {
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev += name.charAt(i);
        }
             if (rev.equalsIgnoreCase(name)){
                 return "This is palindrome";
             }else {
                 return "This is not palindrome"
                 public static void main(String[] args) {
        Task3 word =new Task3();
        System.out.println(word.palindroma("adda"));
;*/
    void isPalindrome(String inputStr) {
        StringBuilder stringBuilder=new StringBuilder(inputStr);
        stringBuilder.reverse();
        String reversedStr=stringBuilder.toString();
        if (inputStr.equals(reversedStr)) {
            System.out.println(inputStr+" is palindrome");
        }else {
            System.out.println(inputStr+" is NOT palindrome");
        }

    }

    public static void main(String[] args) {

        Task3 task3=new Task3();
        //String result=task3.isPalindrome("Kaya"); we cannot assign void methods to variables
        // System.out.println(task3.isPalindrome("Kaya");); cannot use void methods in Println
        task3.isPalindrome("dad");

    }
}

