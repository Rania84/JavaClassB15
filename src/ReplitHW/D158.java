package ReplitHW;

public class D158 {
 public static void main(String[] args) {
  Town town=new Town("Fairfax");
  town.display();
 }
 String city;

 public D158(String city) {
  this.city = city;
 }

 public void display(){
  System.out.println("City name "+city);
 }
 public static class Town extends D158{
  public Town(String city) {
   super(city);
  }
 }
}