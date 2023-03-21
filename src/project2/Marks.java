package project2;

public abstract class Marks {
    abstract double getPercentage();
}
class StudentA extends Marks {
    int grade1;
    int grade2;
    int grade3;

    public StudentA(int grade1, int grade2, int grade3) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    @Override
    double getPercentage() {
        double percentage=(grade1+grade2+grade3)/3;
        return percentage;
    }
}
    class StudentB extends Marks{
        int grade1;
        int grade2;
        int grade3;
        int grade4;

        public StudentB(int grade1, int grade2, int grade3, int grade4) {
            this.grade1 = grade1;
            this.grade2 = grade2;
            this.grade3 = grade3;
            this.grade4 = grade4;
        }

        @Override
        double getPercentage() {
            double percentage=(grade1+grade2+grade3+grade4)/4;
            return percentage;
        }
    }


