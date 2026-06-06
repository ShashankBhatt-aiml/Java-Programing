package OOPS;

abstract class Animal{
    abstract void walk();
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs....");
    }
}

class Chicken {
    public void walk(){
        System.out.println("Wals on  2 legs..");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}
