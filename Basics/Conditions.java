package Basics;
import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username;
        int password;

        System.out.print("Enter Your Username :- ");
        username = sc.nextLine();

        System.out.print("Enter Your Password :- ");
        password = sc.nextInt();

        if(username.equals("admin")  &&  password==1234) {
            System.out.println("Login Successful as Adimin");
        }

        else {
            System.out.println("Invalid Credentials");
        }

        sc.close();
    }
}
