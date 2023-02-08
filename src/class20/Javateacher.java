package class20;

public class Javateacher extends Teacher{
    void code(){
        System.out.println("Java teacher teaches how to code");
    }

    public static void main(String[] args) {
        Javateacher java=new Javateacher();
        java.teacherName="rania";
        java.teacherId="A5566";
        java.homework(); // puplic
        java.grade();//protected
        java.scholarship();//defult
        // java.extraPoint();//private members
    }
}
