package class19;

public class BankAccount {// parent or super class
    long accoutNumber;
    double money;
    void deposit(){
        System.out.println("Deposit methods from bank account class");
    }
}
class Checking extends BankAccount{// child or sub or derived class
    double interest;
void transfer(){
    System.out.println("transfer methods from Checking class");
}
}
class Savings extends BankAccount{
    double profit;
    void takeProfit(){
        System.out.println("Profit method from saving class");
    }
}
class SuperSavings extends Savings{
    void SuperSaving(){
        System.out.println();
    }
}