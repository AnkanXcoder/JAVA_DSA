
import java.util.Scanner;

public class butterfly {
    public static void butpat(int n){
        for (int i = 1; i <= n; i++) {
            // outer loop
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //star
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
                
            }
            //space
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
        
        for (int i = n; i >= 1; i--) {
            // outer loop
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //star
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
                
            }
            //space
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
       
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        butpat(n);
        sc.close();
    }
    
}
