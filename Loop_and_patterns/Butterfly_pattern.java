package Loop_and_patterns;

public class Butterfly_pattern {
    public static void main(String[] args) {
        int n=4;

        //Upper Half
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            int spaces = 2*(n-i);
            for(int s=1;s<=spaces;s++) {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++) {
                System.out.print("*");
            }
        System.out.println(); 
        }

        //Lower half
        for (int i=n;i>=1;i--) {
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            int spaces = 2*(n-i);
            for(int s=1;s<=spaces;s++) {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++) {
                System.out.print("*");
            }
        System.out.println(); 
        }
    }
}
