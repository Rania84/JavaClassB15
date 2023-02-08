package class21;

public class Programming {
    /*c reate a class named 'Programming'.
     While creating an object of the class, if nothing is passed to it,
    then the message "I love programming languages" should be printed.
    If some String is passed to it,
    then in place of "programming languages" the value variable should be printed. Example, if we pass "Java",
    then "I love Java" should be printed
}*/
    String name;
    void programming() {
        System.out.println("I love programming languages");
    }
    void programming(String name){
        System.out.println("I love programming"+name);
    }

    public static void main(String[] args) {
        Programming programming=new Programming();
        programming.programming();
        programming.programming("Java");

    }
}