package ReplitHW;

public class D142 {
    String schoolName;
    int batch;
    int year;
    String lastOfClass;

    D142 (){
        System.out.println(schoolName+" "+batch+" "+year+" "+lastOfClass);

    }
    D142(String schoolName,int batch,int year,String lastOfClass){
        this.schoolName=schoolName;
        this.batch=batch;
        this.year=year;
        this.lastOfClass=lastOfClass;
    }

    public static void main(String[] args) {
        D142 d142=new D142();
        d142.schoolName= "Syntax";
        d142.batch=6;
        d142.year=2020;
        d142.lastOfClass="07/30/2020";
        System.out.println(d142.schoolName+" " + d142.batch+" "+d142.year+" "+d142.lastOfClass);
    }
}
