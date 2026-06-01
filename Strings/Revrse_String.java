package Strings;
import java.util.Scanner;

public class Revrse_String {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter A word :- ");
    String word = sc.next();
    String reversed_word = "";

    for (int i=word.length()-1; i>=0;i--){
        reversed_word+=word.charAt(i);
    }
    System.out.println("Reversed word is :- " + reversed_word);
    sc.close();
    }
}
