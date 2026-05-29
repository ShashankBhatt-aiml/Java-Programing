package Functions_And_Methods;

import java.util.Scanner;

public class Prime_check {
    public static void Check_prime(int n) {
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println(n + " is a Prime Number.");
        }
        else{
            System.out.println(n + " isn't a Prime Number.");

        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number :- ");
        int n = sc.nextInt();

        Check_prime(n);
        sc.close();
    }
}
