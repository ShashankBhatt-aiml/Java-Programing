package Loop_and_patterns;

public class Diamond_pattern {
    public static void main(String[] args) {
        int n = 5;
       
        //upper half.
        for(int i=1;i<=n;i++){
            for(int s=i;s<=n;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(" *");
            }
        System.out.println();
        }
        
        //Lower half.
        for(int i=1;i<=n;i++){
            for(int s=0;s<=i;s++){
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--) {
                System.out.print("* ");
            }
        System.out.println();
        }

    }
}

