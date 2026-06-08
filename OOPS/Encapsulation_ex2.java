package OOPS;

class Atm{
    private String name;
    private int pin;

    public void set_name(String name){
        this.name = name;
    }

    public String get_name(){
        return name;
    }
    
    public int get_pin(){
        return pin;
    }

    public void set_pin(int pin){
        if(pin>=1000&pin<=9999){
            this.pin = pin;
            System.out.println("pin stored sucessfully...");
        }
        else{
            System.out.println(("Invalid pin : Pin must exactly 4 digits..."));
        }
    }
}

public class Encapsulation_ex2 {
    public static void main(String[] args) {
        Atm a1 = new Atm();
        a1.set_name("Shashank");
        
        a1.set_pin(134);        // will print invalid pin.
        a1.set_pin(5566);       // will store the pin.
    }
}
