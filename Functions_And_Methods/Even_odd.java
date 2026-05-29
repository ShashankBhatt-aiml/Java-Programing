package Functions_And_Methods;

import java.util.Scanner;

public class Even_odd {
    public static void Check_Even_Odd(int num) {
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number :- ");
        int num = sc.nextInt();

        Check_Even_Odd(num);

        sc.close();
    }
}
