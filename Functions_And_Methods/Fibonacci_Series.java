package Functions_And_Methods;
import java.util.Scanner;

public class Fibonacci_Series {
    public static void Fibonacci(int n) {
        int firstTerm = 0, secondTerm = 1;
        
        System.out.print("Fibonacci Series till " + n + " terms: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + (i < n ? ", " : ""));

            // Calculate the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter nth term :- ");
        int num = sc.nextInt();

        Fibonacci(num);
        sc.close();
    }
}
