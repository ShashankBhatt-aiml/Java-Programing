package Array;
import java.util.Scanner;

public class Asc_Desc_Order_finder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Size of arr :- ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        boolean Ascending = true;
        boolean Descending = true;

        for(int i=0;i<arr.length;i++){
            System.out.print("Enter a numer at idx " + i + " :- ");
            arr[i] = sc.nextInt();
        }

        System.out.println();

        for(int i=0;i<=arr.length-2;i++){
            if(arr[i] > arr[i + 1]) {
                Ascending = false;
            }

            if(arr[i] < arr[i + 1]) {
                Descending = false;
            }
        }

        if(Ascending) {
            System.out.println("Ascending");
        }
        else if(Descending) {
            System.out.println("Descending");
        }
        else {
            System.out.println("Unsorted");
        }

        sc.close();
        }
        
    }