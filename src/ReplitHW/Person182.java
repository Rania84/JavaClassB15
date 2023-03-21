package ReplitHW;

 class Person182 {
     private   String firstname;
    private String lastname;
    private int birthmonth;
    private int birthday;
    private int birthyear;
 String ssn;

    public Person182(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
        this.ssn = ssn;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getBirthmonth() {
        return birthmonth;
    }

    public int getBirthday() {
        return birthday;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public String getSsn() {
        return ssn;
    }
    public String formatBirthday(){
        return birthmonth+"/"+birthday+"/"+birthyear;
    }

    public static void main(String[] args) {
        Person182 info =new Person182("John","Doe",10,25,1900,"123-45-6789");
        System.out.println(info.getFirstname());
        System.out.println(info.getLastname());
        System.out.println(info.formatBirthday());
        System.out.println(info.getSsn());
    }
}
