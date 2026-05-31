package Array;
import java.util.*;

public class string_io {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array :- ");
        int size = sc.nextInt();

        String names[] = new String[size];

        for(int i=0;i<names.length;i++){
            System.out.print("Enter Name " + (i+1) + ":- ");
            names[i] = sc.next();
        }
        
        System.out.println();

        for(int i=0;i<names.length;i++){
            System.out.println("Name " + (i+1) + " is :- " + names[i]);
        }
        sc.close();


    }    
}
