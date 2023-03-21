package ReplitHW;

public class D121 {
    int num;
    double num1;
    char ch;
    public D121( int num,double num1,char ch){
        this.num=num;
        this.num1=num1;
        this.ch=ch;

    }
    public D121( double num1,int num,char ch){
        this.num1=num1;
        this.num=num;
        this.ch=ch;
    }

    public static void main(String[] args) {
        D121 main=new D121(10,10.23,'a');
        System.out.println(main.num);
        System.out.println(main.num1);
        System.out.println(main.ch);

        D121 main1=new D121(100.23,100,'s');
        System.out.println(main1.num);
        System.out.println(main1.num1);
        System.out.println(main1.ch);


    }


}
