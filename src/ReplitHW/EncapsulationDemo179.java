package ReplitHW;

public class EncapsulationDemo179 {
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
        EncapsulationDemo179 info=new EncapsulationDemo179();
        info.setEmName("Mario");
        info.setEmAge(32);
        System.out.println("Employee Name: "+info.getEmName());
        System.out.println("Employee Age: "+info.getEmAge() );

    }

}
