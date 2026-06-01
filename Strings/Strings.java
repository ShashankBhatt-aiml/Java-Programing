package Strings;
import java.util.Scanner;

//String is a collection of chars...

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Concatenation
        String Firstname = "Shashank";
        String lastname = "Bhatt";
        String fullname = Firstname + " " + lastname;

        System.out.println(fullname);
        
        System.out.println(fullname.length());

        //charAt function.

        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }

        //compare
            // chek for 3 condition and return...
                // +ve value : when Str1 > str2
                // 0 : when Str1 == str2
                // -ve value : when Str1 < str2

        String msg1="hello";
        String msg2="hello";
        if(msg1.compareTo(msg2)==0){
        System.out.println("Strings are Equal.");
        }
        else{
            System.out.println("not equal.");
        }

        // Substring..
        
        String sentence="i am java";

        String name = sentence.substring(4,sentence.length());
        System.out.println(name);

        sc.close();
    }
}
