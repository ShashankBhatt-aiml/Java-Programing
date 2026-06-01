package Strings;
import java.util.Scanner;

public class String_Builder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programing");

        System.out.println(sb);

        //setCharAt()
        sb.setCharAt(4,'_');
        System.out.println(sb);
        
        //insert()
        sb.insert(1, 'a');
        System.out.println(sb);

        //delete()
        sb.delete(1, 2);
        System.out.println(sb);
        
        sb.delete(4,16);
        System.out.println(sb);
        

        sc.close();
    }    
}
