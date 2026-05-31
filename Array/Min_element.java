package Array;
import java.util.Scanner;

public class Min_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Size of arr :- ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.print("Enter a numer at idx " + i + " :- ");
            arr[i] = sc.nextInt();
        }

        System.out.println();

        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Smallest Element is :- " + min);
        
    sc.close();
    }
}