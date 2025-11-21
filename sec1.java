package inheritance;

public class sec1 {
    private String fname;
    private String lname;
    private String number;
    private String email;

    sec1(String fname, String lname, String email, String number){
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.number = number;
    }

    void showProfile(){
        System.out.println("Full name : " + fname + " " + lname);
        System.out.println("Email     : " + email);
        System.out.println("Number    : " + number);
        System.out.println();
    }

    String getEmail(){
        return email;
    }
 }