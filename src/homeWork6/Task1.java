package homeWork6;

public class Task1 {
    /*
    Create a boolean variable workDay andassign true
    create int variable day and assign it to 1
As long as it is workDay print “I need a day off” and increase day.
Once day is 6 print “I do not need a day off anymore”
     */
    public static void main(String[] args) {
        boolean workDay =true;
        int day=1;

          while (workDay==true){
              System.out.println("I need a day off");
              if (day == 5) {
                  workDay=false;
                  System.out.println("I don't need a day off");
              }
              day++;
          }

        }

    }

          /* biff way to solve it
           boolean workDay =true;
        int day=1;

        while(day<6) {
            System.out.println("I need a day off");

            day++;
            if (day == 6) {
                System.out.println("I do not need a day off any more");


           3 way
                boolean workDay=true;
        int day=1;
        while (workDay){
            if(day<=5){
                System.out.println("I need a day off");
            }else {
                System.out.println("I do not need a day off anymore");
                workDay=false;
            }
            day++;  // it is equal to day=day+1 day+=1
        }


            }*/


