package class17;

public class Task2 {
    /*Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
    Tammr Makar (Gainesville,VA) — Today at 7:14 PM
*/
    public static String revStr(String str) {
        /*StringBuilder newStr=new StringBuilder(str);
        String revStr= newStr.reverse().toString();
        return revStr;
    */
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        revStr("Monday");

        //Task2 task2=new Task2();
       // task2.revStr("Monday");
        System.out.println(Task2.revStr("Sunday"));
    }
}



