package ReplitHW;

 interface outputsD177 {
    void display(Double number);
}
interface Function extends outputsD177{
double adding(double firstNumber,double secondNumber);
double subtracting(double firstNumber,double secondNumber);
double multiply(double firstNumber,double secondNumber);
double dividing(double firstNumber,double secondNumber);

}
class Main8 implements Function {

    @Override
    public void display(Double number) {

        System.out.println("Result is ::: " + number);
    }

    @Override
    public double adding(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public double subtracting(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public double multiply(double firstNumber, double secondNumber) {

        return firstNumber * secondNumber;
    }

    @Override
    public double dividing(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }


    public static void main(String[] args) {
        double firstNumber = 100.00;
         double secondNumber = 20.00;

         Main8 main8=new Main8();
        main8.display(main8.adding(firstNumber,secondNumber) );
        main8.display(main8.subtracting(firstNumber,secondNumber));
        main8.display(main8.multiply(firstNumber,secondNumber));
        main8.display(main8.dividing(firstNumber, secondNumber));


    }
}

