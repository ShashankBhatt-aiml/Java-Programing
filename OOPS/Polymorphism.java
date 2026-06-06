package OOPS;
class Child{
    String name;
    int age;

    public void printinfo(String name){
        System.out.println("If you pass name :- " + this.name);
    }
    public void printinfo(int age){
        System.out.println("If you pass age :- " + this.age);
    }
    public void printinfo(String name, int age){
        System.out.println("If you both args then :-" + this.name + " __ " + this.age);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.name="anandam";
        c1.age=19;

        c1.printinfo(c1.name,c1.age);
    }
}
