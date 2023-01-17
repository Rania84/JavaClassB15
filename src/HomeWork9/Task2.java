package HomeWork9;

public class Task2 {
    public static void main(String[] args) {
        /*Create an array of names
         and store all names of your group.
         Then print your name from that array.
          (use 2 different ways of creating an array).
         */

        String[]names={" Mia","Ria","Dan","Rania"};
        System.out.println(names[3]);

        System.out.println("*********************");


        String[]array ={" Mia","Ria","Dan","Rania"};
        for (int i=0;i<array.length;i++){
            if (array[i]=="Rania"){
                System.out.println(array[i]);
            }
        }
    }

}
