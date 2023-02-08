package class19;

public class BankTest {
    public static void main(String[] args) {
BankAccount ba=new BankAccount();
ba .accoutNumber=1451431452;
ba.money=1000;
        ba.deposit();
        System.out.println(ba.accoutNumber);
        System.out.println(ba.money);
        System.out.println("---- creating -----");
        Checking checck= new Checking();
        checck.accoutNumber=5765;
        checck.money=750;
        checck.interest=0;
        checck.deposit();
        checck.transfer();
        System.out.println("creating anobject of  saving class");
        Savings save=new Savings();
        save.accoutNumber=55621533;
        save.money=4545;
        save.profit=100;
        save.deposit();
        save.takeProfit();
    }
}
