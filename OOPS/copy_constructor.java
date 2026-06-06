//Always remember, if two files has same functions. then it will give you tasty - tasty Error...

package OOPS;

class CopyStudent{
    String name;
    int age;

    CopyStudent(CopyStudent s2){         
        this.name=s2.name;
        this.age=s2.age;
    }
    
    CopyStudent(){
        
    }

    public void info(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class copy_constructor {
    public static void main(String[] args) {
        
        CopyStudent s1 = new CopyStudent();
        s1.name="bitu";
        s1.age=17;

        CopyStudent s2 = new CopyStudent(s1);
        s2.info();

    }
}
