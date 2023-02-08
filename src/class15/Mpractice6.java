package class15;

public class Mpractice6 {
    //Create a method createEmail().
    // Based on values of users name,
    // lastName and email type,
    // your method should return complete email Address. Example:  createEmail(John, Snow, gmail)
    // → johnsnow@gmail.com or
    String createEmail (String fName,String lName,String email){
        return fName.toLowerCase()+lName.toLowerCase()+"@"+email.toLowerCase();
    }

    public static void main(String[] args) {
        Mpractice6 task =new Mpractice6();
        System.out.println(task.createEmail("jhon","snow","gmail"));
    }
}
