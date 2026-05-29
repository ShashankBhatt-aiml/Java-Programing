package Functions_And_Methods;

import java.util.Scanner;

public class Print_Table {
    public static void print_table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n + " * " + i + " => " + n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Number :- ");
        int n = sc.nextInt();

        print_table(n);
        sc.close();
    }
}
