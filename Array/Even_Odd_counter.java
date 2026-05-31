package Array;
import java.util.Scanner;

public class Even_Odd_counter {
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

        int even=0,odd = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 ==0){
                even+=1;
            }
            else{
                odd+=1;
            }
        }
        System.out.println("Even number's count is :- " + even);
        System.out.println("Odd number's count is :- " + odd);
        
    sc.close();
    }
}