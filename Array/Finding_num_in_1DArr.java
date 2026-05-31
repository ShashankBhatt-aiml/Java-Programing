package Array;
import java.util.*;

public class Finding_num_in_1DArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,6,9,5,7,3,8,1};

        System.out.print("Enter a number to find ;- ");
        int n = sc.nextInt();


        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("Number Found At Idx :- " + i);
                break;
            }
        }
    
        sc.close();
    }
}
