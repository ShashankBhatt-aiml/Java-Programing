package Recursion;
import java.util.Scanner;

public class Fibonacci_method2 {
    public static void Fibo(int a, int b, int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(c + " ");
        Fibo(b, c, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter nth term :- ");
        int n=sc.nextInt();
        System.out.print("0 1 ");
        Fibo(0,1,n-2);
        sc.close();
    }    
}
