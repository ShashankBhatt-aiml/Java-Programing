package Loop_and_patterns;
import java.util.Scanner;

public class Table_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number :- ");
        int num = sc.nextInt();
        
        int i = 1;
        while (i<=10) {
            System.out.println(num + "*" + i + "=" + num*i);
            i+=1;
        }
    sc.close();
        
    }
}

