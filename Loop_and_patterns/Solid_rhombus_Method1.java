package Loop_and_patterns;

public class Solid_rhombus_Method1 {
    public static void main(String[] args) {
        int n=5;
        for (int i=0;i<=n;i++) {
            for (int j=5;j>=i;j--) {
                System.out.print(" ");
            }
            for (int k=0;k<=5;k++) {
                System.out.print("*");

            }
        System.out.println();
        }
    }
}
