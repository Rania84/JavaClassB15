package class6;


import java.util.Scanner;

public class logicalOrDemo {
    public static void main(String[] args) {
        System.out.println("Enter the day");
        Scanner sc=new Scanner(System.in);
        String day= sc.next();
        if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Friday")){
            System.out.println("No class java");
        } else if (day.equalsIgnoreCase("saturday")||day.equalsIgnoreCase("Sunday")) {
            System.out.println("jave enjoy class");
        } else if (day.equalsIgnoreCase("wednesday")||day.equalsIgnoreCase("tuesday")) {
            System.out.println("ManualTesting class");
        } else if (day.equalsIgnoreCase("Thursday")) {
                System.out.println("Review class");
            }else {
                System.out.println("Wrong day entered");
            }
            
        }

    }


