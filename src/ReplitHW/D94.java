package ReplitHW;

public class D94 {
    public static void main(String[] args) {
        String given="I love Java classes at Syntax";
        System.out.println(given.substring(12));
        System.out.println(given.substring(0,12));
    // Diff way to print specifed words
        System.out.println(given.subSequence(0,12));
    }
}
