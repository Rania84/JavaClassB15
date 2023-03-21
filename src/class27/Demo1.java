package class27;

public class Demo1 {
    public static void main(String[] args) {

        String name="Zafar";
        String name2="rony";
        String name3="nana";

        String[] names = {"rania", "Nima", "Dodo", "rania"};
        displayNames(names);
        display(name,name2,name3);
    }
    public static void  displayNames(String []names){
        for (String name : names){
            System.out.println(name);

        }

    }
    public  static void display(String name , String name2,String name3 ){
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
    }
}
