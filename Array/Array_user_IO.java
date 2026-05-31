package Array;
import java.util.*;

public class Array_user_IO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array :- ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i =0;i<size;i++){
            System.out.print("enter a number at idx "+ i +":- ");
            arr[i] = sc.nextInt();
        }

        System.out.println();

        for(int i=0;i<size;i++){
            System.out.println("Value at index " + i + ":- " + arr[i]);
        }
        sc.close();
    }
}
