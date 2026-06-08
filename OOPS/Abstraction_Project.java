package OOPS;

abstract class Payment{
    private double amount;

    Payment(double amount){
        this.amount = amount;
    }

    public double get_amount(){
        return amount;
    }

    abstract void makePayment();
    /*
    No implementation.
        Reason:
        Different payment methods pay differently.
    */
    public void paymentStatus(){
        System.out.println("Payment Processed Successfully.");
    }
}
class UPI extends Payment{
    String UPIid;

    UPI(double amount, String upiId){
        super(amount);
        this.UPIid=upiId;
    }
    
    @Override
    void makePayment(){
        System.out.println("UPI Payment\n" + 
                            " Amount : " + get_amount()+"\n"+
                            "UPI ID : " + UPIid);
    }
}

class CreditCard extends Payment{
    String cardNumber;

    CreditCard(double amount, String cardNumber){
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void makePayment(){
        System.out.println("Credit Card Payment\n" +
                        "Amount : " + get_amount() + "\n" +
                        "Card Number : " + cardNumber);
    }
}


public class Abstraction_Project {
    public static void main(String[] args) {
        Payment p1 = new UPI(5000, "Shashank@upi");

        Payment p2 = new CreditCard(2000, "ABCD-WXYZ-PQRS-1234");

        p1.makePayment();
        p1.paymentStatus();

        System.out.println();

        p2.makePayment();
        p2.paymentStatus();
    }
}
