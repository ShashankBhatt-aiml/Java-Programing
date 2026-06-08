package OOPS;

class Employee{
    String name;
    double salary;

    Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }

    public void displayInfo(){
        System.out.println("Name :- " + name);
        System.out.println("Salary :- " + salary);
    }

}

class Developer extends Employee{
    String programmingLanguage;

    Developer(String name, double salary, String programmingLanguage){
        super(name, salary);
        this.programmingLanguage=programmingLanguage;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Language :- " + programmingLanguage);
    }
}

class Manager extends Employee {
    int teamSize;
    
    Manager(String name, double salary, int teamSize){
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Team sise :- " + teamSize);
    }
}


public class Polymorphism_project {
    public static void main(String[] args) {
        Employee e1 = new Developer("Munna Tripathi", 80000, "assembly");

        Employee e2 = new Manager("akhandanand tripathi", 150000, 15);

        System.out.println("===== EMPLOYEE 1 =====");
        e1.displayInfo();
        
        System.out.println();
        
        System.out.println("===== EMPLOYEE 2 =====");
        e2.displayInfo();
    }
}
