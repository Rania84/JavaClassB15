package ReplitHW;

public class ParentD164 {
    public void hello() {
        System.out.println("method in Parent class");
    }

   static class child1 extends ParentD164 {
        @Override
        public void hello() {
            System.out.println("method in Child1 class");
        }
    }

  static   class child2 extends ParentD164 {
        @Override
        public void hello() {
            System.out.println("method in Child2 class");
        }
    }

   static class child3 extends ParentD164 {
        @Override
        public void hello() {
            System.out.println("method in Child3 class");
        }

    }

    public static void main(String[] args) {
        ParentD164 []parentD164s={new child1(),new child2(),new child3()};
        for(ParentD164 child:parentD164s){
            child.hello();
        }
    }
}