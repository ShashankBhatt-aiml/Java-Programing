package Basics;

import java.util.Scanner;

public class Input_output {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        double marks;

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        System.out.print("Enter your marks: ");
        marks = sc.nextDouble();

        System.out.println("\nStudent Details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);

        sc.close();

    }

}
