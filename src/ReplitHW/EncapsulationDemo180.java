package ReplitHW;

 class EncapsulationDemo180 {
    private String emName="John";

    private int emAge=30;



    public String getEmName(){
        return emName;

    }

    public int getEmAge(){
        return emAge;

    }

    public static void main(String[] args) {
        EncapsulationDemo180 info=new EncapsulationDemo180();

        System.out.println("Employee Name: "+info.getEmName());
        System.out.println("Employee Age: "+info.getEmAge() );

    }

}
