package Loop_and_patterns;
import java.util.Scanner;

public class Natural_Num_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number :- ");
        int num = sc.nextInt();
        int sum = 0;

        for(int i=1;i<=num;i++) {
            sum += i;
        }
        System.out.println("sum of " + num + " Natural Numbers is :- " + sum);
    sc.close();
    }    
}
