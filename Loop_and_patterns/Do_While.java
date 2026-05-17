package Loop_and_patterns;
import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        
        do {
            System.out.println("\nTo Terminate the Program Enter :- 8");

            System.out.print("Enter a Number :- ");
            num = sc.nextInt();

            System.out.println("\nHello - Bonjour");
            System.out.println("Entered Number is :- " + num);

        } while (num != 8);
    sc.close();
    }
}
