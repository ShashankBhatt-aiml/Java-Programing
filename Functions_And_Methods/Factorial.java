package Functions_And_Methods;

import java.util.Scanner;

public class Factorial {
    public static void factorial(int num) {
        
        if(num<0){
            System.out.println("Invalid Number :- Number Can't be 0");
            return;
        }
        int fact = 1;
        for(int i=num;i>=1 ;i--){
            fact*=i;
        }
        System.out.println("Factorial is :- " + fact);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number :- ");
        int num = sc.nextInt();

        factorial(num);

        sc.close();
    }
}
