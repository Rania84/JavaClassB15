package class22;

import ReplitHW.D;

public class Degree {
    void getPrerequisite(){
        System.out.println("to get degree you need high school diploma");
    }
    class Bachelors extends Degree{

    }
    class Masters extends Degree{
        @Override
        void getPrerequisite() {
            System.out.println("to get masters you need degree first");
        }
    }

    public static void main(String[] args) {
        Degree degree=new Degree();
        degree.getPrerequisite();

    }
}
