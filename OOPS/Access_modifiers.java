package OOPS;
import java.util.Scanner;

class Account{
    public String name;
    protected String email;
    private String password;

    public void info(String name, String email){
        System.out.println("Owner's Name :- " + this.name);
        System.out.println("Owner's Name :- " + this.email);
        
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

public class Access_modifiers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Account a1 = new Account();
        a1.name="Arpit";
        a1.email="abc@sun";
        
        a1.info("arpit","ab@sun");

        a1.setPassword("hello12");
        
        System.out.println("Password is :- " + a1.getPassword());

        sc.close();
    }
}