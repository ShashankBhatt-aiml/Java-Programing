package Functions_And_Methods;

import java.util.Scanner;

public class Print_Average {
    public static void print_average(int n1, int n2, int n3){
        int avg = (n1+n2+n3)/3;
        System.out.println("Average is :- " + avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 :- ");
        int n1=sc.nextInt();

        System.out.print("Enter Number 2 :- ");
        int n2=sc.nextInt();
        
        System.out.print("Enter Number 3 :- ");
        int n3=sc.nextInt();

        print_average(n1, n2, n3);

        sc.close();
    }
    
}