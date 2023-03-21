package ReplitHW;

public class D144 {
    String label;
    double price;
    String category;
    boolean hasExpiration;
    int stock;




    public   D144(String label, double price, String category, boolean hasExpiration, int stock){
        this.label=label;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;
    }
    public D144(String label,double price,int stock) {
        this(label, price, "misc", false, stock);
    }
    public D144(String label,double price){
        this(label,price,"null",false,0);
    }
    public void display(){
        System.out.println(label+" "+price+" "+category+"" + " "+hasExpiration+" "+stock);

    }

    public static void main(String[] args) {
        D144 line1=new D144("Eggs",3.0,"Produce",true,10);
        line1.display();
        D144 line2=new D144("Paper Towels",2.0,24);
        line2.display();
        D144 line3=new D144("Paper Towels",2.0);
        line3.display();
    }
}
