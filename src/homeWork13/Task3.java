package homeWork13;

public class Task3 {
    public static void main(String[] args) {
        //You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
        // How would you find out how many sentences are in that String?

        String a ="Is it saturday? Is it raining? Do we have a Java Class today?";
      /*  String[] sants=a.split("[.,!.?]");
        System.out.println(sants.length);
        System.out.println(sants[2]);
*/
        System.out.println(a.split("[?]").length);
    }
}
