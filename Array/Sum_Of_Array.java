package Array;
import java.util.Scanner;

public class Sum_Of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Size of arr :- ");
        int sum = 0,size = sc.nextInt();

        int arr[] = new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.print("Enter a numer at idx " + i + " :- ");
            arr[i] = sc.nextInt();
        }

        System.out.println();

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of arr is :- " + sum);
        
    sc.close();
    }
}