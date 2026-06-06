package OOPS;
import java.util.Scanner;;

class Pen{
    String color,type;

    public void write(){
        System.out.println("Writing Something with color "+ color+"...");
    }

    public void PrintColor(){
        System.out.println("color is :- " + this.color);
    }
}

class Student{
    String name;
    int age;

    public void info(){
        System.out.println(name);
        System.out.println(age);
    }
}

public class class_object_example {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pen pen1 = new Pen();
        pen1.color="blue";
        pen1.type="Fountain";

        pen1.write();

        Pen pen2 = new Pen();
        pen2.color="Green";
        pen2.type="Gel";

        pen2.PrintColor();
        
        Student s1 = new Student();

        System.out.print("Enter name :- ");
        s1.name = sc.next();

        System.out.print("Enter Age :- ");
        s1.age = sc.nextInt();

        s1.info();

        sc.close();
    }
}


