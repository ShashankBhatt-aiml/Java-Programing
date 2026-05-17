package Loop_and_patterns;

public class Solid_rhombus_Method2 {
    public static void main(String[] args) {
        int n=5;
        for (int i=0;i<=n;i++) {
            for (int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for (int k=1;k<=5;k++) {
                System.out.print("*");

            }
        System.out.println();
        }
    }
}
