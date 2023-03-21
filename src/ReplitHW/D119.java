package ReplitHW;

public class D119 {
    public static    String censorletter(String words, char letter) {

          String newWords = words.replace(letter, '*');

          return newWords;
      }

     public static void main(String[] args) {
          D119 d119=new D119();
         System.out.println(d119.censorletter("computer science",'e'));
         System.out.println(d119.censorletter("trick or treat",'t'));

     }
}
        // return name.replaceAll(String.valueOf(letter), "*");
          /*String censorLetter (String s, char c) {
    String in=Character.toString(c);
    s=s.replace(in, "*");
     return s;
    }

    public static void main(String[] args) {
    Main main = new Main();
    System.out.println(main.censorLetter("computer science",'e'));
    System.out.println(main.censorLetter("trick or treat",'t'));*/




