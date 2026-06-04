package Recursion;
import java.util.Scanner;

public class Sum_Natural_Num {

    public static void print_sum(int i,int n, int sum) {
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        print_sum(i+1,n,sum);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter a Number :- ");
        int n = sc.nextInt();

        print_sum(1,n,0);

        sc.close();
    }
}
