package ReplitHW;

public class D129 {
    static String countryName;
    static String continent;
    static void printInfo(){
        System.out.println(countryName+" located on "+continent+" continent");
    }

    public static void main(String[] args) {
        countryName="Morocco";
        continent="Africa";

        printInfo();
    }

}
