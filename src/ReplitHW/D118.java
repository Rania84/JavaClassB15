package ReplitHW;

public class D118 {
    /*public static String spaceout(String s){
        StringBuilder space=new StringBuilder();
        for (int i=0;i<s.length();i++){
            space.append(s.charAt(i)).append(" ");

        }
        return space.toString();

    }

    public static void main(String[] args) {
        System.out.println(spaceout("hello"));
    }*/
    String space = "";
    public String spaceOut(String s) {
        for (int i = 0; i < s.length(); i++) {
            space += (s.charAt(i) + " ");
        }
        return space;
    }

    public static void main(String[] args) {

        D118 withSpace = new D118();
        System.out.println(withSpace.spaceOut("hello"));

    }


}