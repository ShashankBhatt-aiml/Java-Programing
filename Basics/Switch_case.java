package Basics;
import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1, 2 or 3 for gtreating :- ");
        int button = sc.nextInt();

        switch (button) {
            case 1: System.out.println("Hello");
                break;
            
            case 2: System.out.println("Namastey");
                break;

            case 3: System.out.println("Bonjour");
                break;
        
        }
    sc.close();
    }
    
}
