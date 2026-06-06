package OOPS;

class Student_encap{
    private String name;
    private int age;

    public void set_name(String name){
        this.name = name;
    }

    public String get_name(){
        return name;
    }

    public void set_age(int age){
        this.age=age;
    }

    public int get_age(){
        return age;
    }
}

public class Encapsulation_ex1 {
    public static void main(String[] args){

        Student_encap s1 = new Student_encap();

        s1.set_name("sharma");
        System.out.println(s1.get_name());

        s1.set_age(23);
        System.out.println(s1.get_age());
    }
}
