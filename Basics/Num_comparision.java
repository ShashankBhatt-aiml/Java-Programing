package Basics;
import java.util.Scanner;

public class Num_comparision {
    public static void main(String[] args) {        
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("enter Number 1 :- ");
        num1 = sc.nextInt();
        
        System.out.print("enter Number 2 :- ");
        num2 = sc.nextInt();

        if(num1 == num2) {
            System.out.println("Both are equal.");
        }
        else if(num1 > num2) {
            System.out.println("Num1 is greater.");
        }
        else{
            System.out.println("Num2 is greater.");
        }
    sc.close();
    }
}
