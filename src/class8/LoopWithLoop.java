package class8;

import java.util.Scanner;

public class LoopWithLoop {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name");
        while (scanner.next().equalsIgnoreCase("Sha")){
            System.out.println("Great Student");
        }
        }
    }

