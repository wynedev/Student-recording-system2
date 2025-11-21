package inheritance;
import java.util.Scanner;

public class main {

    static Scanner scan = new Scanner(System.in);
    static int count = 0;
    static int studcount = 20;
    static sec1[] studprof = new sec1[studcount];

    public static void main() {

        boolean isRunning = true;

        do{
            System.out.println("***** Student Registration *****");
            System.out.println("[1] Login");
            System.out.println("[2] Sign-Up");
            System.out.println("[3] Exit");

            System.out.print("Enter choice: ");
            int choice = scan.nextInt();
            scan.nextLine();

            switch(choice){
                case 1 -> {
                    studentlogin();
                }
                case 2 -> {
                    studentRegister();
                }
                case 3 -> {
                    isRunning = false;
                }
            }
        }while(isRunning);

        System.out.println("You've exited the program..");

    }
    static void studentRegister() {

        String fname,lname,email;
        String number;

        if(count >= studcount){
            System.out.println("Slot is full...\n");
            return;
        }

        System.out.println("\n***** Register *****");

        System.out.print("First Name   : ");
        fname = scan.nextLine();

        System.out.print("Last Name    : ");
        lname = scan.nextLine();

        System.out.print("Enter number : ");
        number = scan.nextLine();

        boolean validEmail = false;

        System.out.print("Enter email  : ");
        email = scan.nextLine();

        validEmail = checkemailvalidity(email);

        if(validEmail){
            studprof[count] = new sec1(fname,lname,email,number);
            System.out.println("Account creation successful...\n");
            count++;
        }
    }
    static void studentlogin() {

        String email;
        boolean isFound = false;

        System.out.println("\n***** Student Login *****");

        System.out.print("Enter email to login: ");
        email = scan.nextLine();

        System.out.print("Searching for account");

        for(int i = 0; i < 4; i++){
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }
        System.out.println();

        for(int i = 0; i < studprof.length; i++){
            if(studprof[i] == null){
                continue;
            }
            else if(email.equals(studprof[i].getEmail())){
                System.out.println("Account found\n");
                studprof[i].showProfile();
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Account not found\n");
        }
    }
    static boolean checkemailvalidity(String email) {
        if(!email.endsWith("@gmail.com")){
            System.out.println("Invalid email...");
            return false;
        }
        else{
            return true;
        }
    }
}
