package Strings;
import java.util.Scanner;

public class Reverse_StringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word :- ");
        String word = sc.next();
        String rev_word = "";

        for(int i=word.length()-1;i>=0;i--){
            rev_word+=word.charAt(i);
        }
System.out.println("Reversed word is :- "+rev_word);
        sc.close();
    }
}