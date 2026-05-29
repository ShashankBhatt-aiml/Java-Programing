package Functions_And_Methods;

import java.util.Scanner;

public class Odd_Nums_Sum {
    public static void odd_numbers_sum(int n){
        int sum=0;
        for(int i=1;i<=n;i+=2){
            sum+=i;
        }
        System.out.println("Sum of odd nums is :- "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Number :- ");
        int n = sc.nextInt();

        odd_numbers_sum(n);

        sc.close();
    }
}
