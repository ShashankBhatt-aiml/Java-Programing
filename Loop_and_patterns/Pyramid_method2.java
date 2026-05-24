package Loop_and_patterns;

public class Pyramid_method2 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int s=i;s<=n;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}
