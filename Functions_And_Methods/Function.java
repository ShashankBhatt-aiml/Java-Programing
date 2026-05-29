package Functions_And_Methods;

import java.util.Scanner;

public class Function {
    public static void PrintName(String Name){
        System.out.println("Hello "+Name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        PrintName(name);    //Calling Function PrintName

        sc.close();
    }
}
