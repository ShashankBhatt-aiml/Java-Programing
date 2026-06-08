package OOPS;
import java.util.Scanner;

class BankAccount{
    private String accountHolderName;
    private int accountNumber;
    private double balance = 0;
    private int pin;

    public void setAccountHolderName(String name){
        this.accountHolderName = name;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public void setAccountNumber(int accountNumber){
        if (accountNumber >= 10000 && accountNumber <= 99999999) {       //ac_no can be between 5 to 8 numbers.
            this.accountNumber = accountNumber;
        }
        else{
            System.out.println("Wrong Formate : Must be between 5 to 8 numbers.");
        }
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setPin(int pin){
        if(pin>=1000 && pin<=9999){
            this.pin = pin;
        }
        else{
            System.out.println(("Invalid pin : Pin must exactly 4 digits..."));
        }
    }


    public void deposit(double amount){
        if(amount>0){
            this.balance +=amount;
            System.out.println("Amount deposited successfully.");
        }
        else{
            System.out.println("Deposit amount can't be 0!");
        }
    }

    public void withdraw(Scanner sc){

        System.out.print("Enter PIN to withdraw:- ");
        int enteredPin = sc.nextInt();

        System.out.println("Enter amount to withdraw :- ");
        double amount = sc.nextDouble();

        if(enteredPin == pin){
            if(amount>0 && amount<=balance){
                this.balance -= amount;
                System.out.println("Withdraw successful.");
            }
            else{
                System.out.println("Withdraw should be more then 0 and less then account balance.");
            }
        }
        else{
            System.out.println("Wrong pin!!!");
        }
    }
    
    public void checkBalance(int enteredPin){
        if (enteredPin==pin){
            System.out.print("Your Account Balance is :- " + balance);
        }
        else{
            System.out.println("Wrong Pin!!!");
        }
    }
}

public class Encapsulation_Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BankAccount sb = new BankAccount();

        System.out.println("===== BANK ACCOUNT MENU =====\n" +
                        "1. Create Account\n" +
                        "2. Deposit Money\n" +
                        "3. Withdraw Money\n" +
                        "4. Check Balance\n" +
                        "5. Show Account Details\n" +
                        "6. Exit\n"
                    );
        System.out.print("Enter Your Choice :- ");
        int choice = sc.nextInt();
        sc.nextLine();


        if(choice==6){
            sc.close();
            return;
        }else{            
            System.out.print("Enter your name :- ");
            sb.setAccountHolderName(sc.nextLine());
            
        
        int accNo;
        while(true){
            System.out.print("Enter account number :- ");
            accNo = sc.nextInt();

            if(accNo >= 10000 && accNo <= 10000000){
                sb.setAccountNumber(accNo);
                break;
            }

            System.out.println("Wrong Format! Try again.");
        }
            
        int pin;
        while (true) {
            System.out.print("Set 4 digit PIN :- ");
            pin = sc.nextInt();

            if (pin >= 1000 && pin <= 9999) {
                sb.setPin(pin);
                break;
            }

            System.out.println("Invalid PIN! PIN must be exactly 4 digits.");
        }
            
            System.out.print("Account created successfully.");
            System.out.println();
            
            System.out.print("Enter amount to deposit :- ");
            sb.deposit(sc.nextDouble());
            
            sb.withdraw(sc);
            
            System.out.print("Enter PIN to check balance:- ");
            sb.checkBalance(sc.nextInt());
            
            
        }
        sc.close();
    }
}
