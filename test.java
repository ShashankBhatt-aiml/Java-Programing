
import java.util.Scanner;

public class test {
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
        int min2 = Integer.MAX_VALUE;

        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>max){
        //         max2=max;
        //         max = arr[i];
        //     }
        // }
        // System.out.println("Smallest Element is :- " + max);
        // System.out.println("Smallest Element is :- " + max2);

        for(int i=0;i<arr.length;i++){
            if(arr[i]< min){
                min2=min;
                min = arr[i];
            }
        }
        System.out.println("Smallest Element is :- " + min);
        System.out.println("Smallest Element is :- " + min2);
        
    sc.close();
    }
}