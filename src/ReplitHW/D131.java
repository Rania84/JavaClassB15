package ReplitHW;

public class D131 {
    public static String thirdLetter( String s ){

            StringBuilder result=new StringBuilder();
            for (int i=0;i<s.length();i+=3){
                result.append(s.charAt(i))
  ;          }
        return result.toString();
    }
   public static void main(String[] args){
    System.out.println(thirdLetter("hello there")); //"hltr"
    System.out.println(thirdLetter("technology")); //"thly"
}
}
