package ReplitHW;

public class D148 {
    String item;
    double price;
    int quantity;

    public D148(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;

    }

    public double itemTotalPrice(){
        double totalValue=price*quantity;
        System.out.println(item+" Total Value "+totalValue);
        return totalValue;
    }

    public static void main(String[] args) {
        D148 blanket=new D148("Blanket",99.88,1);
        D148 mattress=new D148("Mattress",439.18,1);
       double totalBlanket= blanket.itemTotalPrice();
       double totalmatters= mattress.itemTotalPrice();
        double totalPurchase= totalBlanket+totalmatters;
        System.out.println("You purchased "+totalPurchase+" Today");

    }
}
