package Functions_And_Methods;

import java.util.Scanner;

public class Adding_num {
    public static int Add(int num1, int num2){
        int sum=num1+num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num1 :- ");
        int num1 = sc.nextInt();

        System.out.print("Enter Num2 :- ");
        int num2 = sc.nextInt();

        int sum = Add(num1, num2);
        System.out.println(num1 + " + " + num2 + " => " + sum);

        sc.close();
    }
}
