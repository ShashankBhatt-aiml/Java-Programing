package Recursion;
import java.util.Scanner;

public class recursion {

    public static void print_num(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        print_num(n-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter a Number :- ");
        int n = sc.nextInt();

        print_num(n);
        
        sc.close();
    }
}
