package project2;

public class MarksTester {
    public static void main(String[] args) {
        StudentA studentA = new StudentA(30, 40, 50);
        StudentB studentB = new StudentB(50, 60, 70, 80);
        System.out.println(studentA.getPercentage());
        System.out.println(studentB.getPercentage());
    }
}