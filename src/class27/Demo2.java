package class27;

public class Demo2 {
    public static void main(String[] args) {
        String target="Savo";


        String[] names = {"rania", "Nima", "Dodo", "mia"};
        System.out.println(contains(target,names));

    }public static boolean contains(String target,String []names){
        for (String name:names) {
            if (name.equals(target)) {

                return true;
            }
        }
        return false;

    }}

