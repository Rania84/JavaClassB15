package ReplitHW;

 class EncapsulationDemo181 {
    private long acc_no;
    private String name;
    private String email;
    private double amount;

    public void setAcc_no(long acc_no1 ){
        acc_no=acc_no1;
    }
    public long getAcc_no(){
        return acc_no;
    }
    public void setName(String name1) {
        name = name1;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String email1){
       email=email1;
    }
    public String getEmail(){
        return email;
    }
    public void setAmount(double amount1){
        amount=amount1;
    }

    public double getAmount() {
        return amount;
    }

    public static void main(String[] args) {
        EncapsulationDemo181 info=new EncapsulationDemo181();
        info.setAcc_no(7560504000l);
        info.setName("Sumair");
        info.setEmail("sumair@syntax.com" );
        info.setAmount(50000.0);
        System.out.println(info.getAcc_no()+" "+info.getName()+" "+info.getEmail()+" "+info.getAmount());


    }

}
