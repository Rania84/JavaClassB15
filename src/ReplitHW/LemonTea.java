package ReplitHW;

abstract class TeaD173 {
    String teaType;

    public TeaD173(String teaType) {
        this.teaType = teaType;
    }

    public abstract void addSugar();

    }

    public  class LemonTea extends TeaD173 {

        public LemonTea(String teaType) {
            super("lemonTea");
        }

        @Override
        public void addSugar() {
            System.out.println("For Lemon Tea we need 2 spoons of sugar");
        }
    }

    class ChaiTea extends TeaD173 {

        public ChaiTea(String teaType) {
            super(teaType);
        }

        @Override
        public void addSugar() {
            System.out.println("For Chai Tea we need 1 spoon of sugar");
        }


        public static void main(String[] args) {
            TeaD173 tea = new LemonTea("Lemon");
            tea.addSugar();

            TeaD173 tea1= new ChaiTea("Chia");
            tea1.addSugar();

        }

        }

    

