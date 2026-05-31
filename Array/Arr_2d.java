package Array;
import java.util.Scanner;

public class Arr_2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N. of Rows :- ");
        int row = sc.nextInt();
        
        System.out.print("Enter N. of Cols :- ");
        int col = sc.nextInt();

        int[][]arr = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("Enter value at " + i + "," + j + " :- ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
