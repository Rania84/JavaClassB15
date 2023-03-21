package ReplitHW;

public class D152 {
    public static void main(String[] args) {
        Child child=new Child("vienna");

    }
        String city;
        public D152(String city){
            this.city=city;
            System.out.println(city);
        }
        public D152(){
            System.out.println("Parent Constructor");
        }
        public static class Child extends D152{
            public Child(String city) {
                super(city);
            }


        }
    }

