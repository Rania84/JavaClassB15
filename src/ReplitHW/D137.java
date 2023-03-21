package ReplitHW;

public class D137 {
    public String name;
    private String city;
    String schoolName ;
    protected int batchNum;
     void printInfo(){
         System.out.println("My name is "+name+" and I live in "+city+". I study at "+schoolName+" in batch "+batchNum);
     }

    public static void main(String[] args) {
        D137 info=new D137();
        info.name="John";
        info.city="Miami";
        info.schoolName="Syntax";
        info.batchNum=9;
        info.printInfo();
    }
}
