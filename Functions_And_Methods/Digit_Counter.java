package Functions_And_Methods;

import java.util.Scanner;

public class Digit_Counter {
    public static void digit_count(int number){
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

    public static void main(String[] args){
        
    }
}
