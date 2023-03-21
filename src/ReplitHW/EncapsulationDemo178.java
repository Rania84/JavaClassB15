package ReplitHW;

public class EncapsulationDemo178 {
    private String emName;
    private int emAge;

    public void setEmName(String newEmName){
        emName=newEmName;

    }
    public String getEmName(){
        return emName;

    }
    public void setEmAge(int newEm){
        emAge=newEm;
    }
    public int getEmAge(){
        return emAge;

    }

    public static void main(String[] args) {
        EncapsulationDemo178 info=new EncapsulationDemo178();
        info.setEmName("John");
        info.setEmAge(30);
        System.out.println("Employee Name "+info.getEmName());
        System.out.println("Employee Age "+info.getEmAge() );

    }

}
