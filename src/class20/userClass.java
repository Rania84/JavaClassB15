package class20;

public class userClass {
    String name;
    int mobilenumber;

    userClass(String name, int mobilenumber) {
        this.name = name;
        this.mobilenumber = mobilenumber;
    }

    class userInfo extends userClass {
        String address;

        userInfo(String name, int mobilenumber, String address) {
            super(name, mobilenumber);
            this.address = address;

        }

        void userDetails() {
            System.out.println("Name: " + name);
            System.out.println("Mobile Number: " + mobilenumber);
            System.out.println("Address: " + address);
        }
    }


    public void main(String[] args) {
        userInfo ui =new userInfo("Adem",455636458,"london");
           ui.userDetails();


    }}