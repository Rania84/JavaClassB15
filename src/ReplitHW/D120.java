package ReplitHW;

public class D120 {
    int year;
    String school;
    int batch;

          D120(int year,String school,int batch){
             this.year=year;
             this.school=school;
             this.batch=batch;
        }
              void printInfo(){
                  System.out.println("I am a student of batch " +batch + " studying at " + school + " in the year of " + year);
              }
    public static void main(String[] args) {
        D120 d120=new D120(2021,"Syntax",9) ;
        d120.printInfo();

        /*public class Main {
   int year = 2021;
    String school = "Syntax";
    int batch = 15;


              void printInfo( ){
                  System.out.println("I am a student of batch " +batch + " studying at " + school + " in the year of "+ year);
              }

    public static void main(String[] args) {
        Main d120=new Main() ;
        d120.printInfo();

}*/
}
    }



