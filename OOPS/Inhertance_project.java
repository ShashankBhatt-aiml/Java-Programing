package OOPS;

class Vehicle{

    String brand,model;

    Vehicle(String brand, String model){
        this.brand=brand;
        this.model=model;
    }

    public void displayInfo(){
        System.out.println("Brand :- " + brand);
        System.out.println("Model :- " + model);
    }
}

class Car extends Vehicle{
    int numberOfDoors;

    Car(String brand, String model, int numberOfDoors){
        super(brand,model);
        this.numberOfDoors=numberOfDoors;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Doors :- " + numberOfDoors);
    }
}

class Bike extends Vehicle{
    boolean hasGear;

    Bike(String brand, String model, boolean hasGear){
        super(brand, model);
        this.hasGear=hasGear;
    }

    public void displayInfo(){
    super.displayInfo();
    System.out.println("Gear Available : " + hasGear);
    }
}


public class Inhertance_project {
    public static void main(String[] args) {
        Car c1 = new Car("Land Rover", "Defender Octa 110", 5);
        Bike b1 = new Bike("Royal Enfeild", "Super Meteor 650", true);
        System.out.println();

        System.out.println("===== CAR DETAILS =====");
        c1.displayInfo();
        
        System.out.println();
        
        System.out.println("===== Bike DETAILS =====");
        b1.displayInfo();

    }
}
