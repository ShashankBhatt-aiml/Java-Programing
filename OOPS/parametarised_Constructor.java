package OOPS;

class Student{
    String name;
    int age;

    Student(String name,int age){         // Constructor with parameters...
        this.name=name;
        this.age=age;
    }

    public void info(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class parametarised_Constructor {
    public static void main(String[] args) {
        
        Student s1 = new Student("bitu", 15);         //while creating the object, we have to pass arguments also...
        s1.info();

    }
}
