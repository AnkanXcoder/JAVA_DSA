
import java.util.Scanner;

public class ncr {
    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact*i;
            
        }
        return fact;
    }
    public static int binCoeff(int n , int r) {
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);
         
        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter value of r: ");
        int r = sc.nextInt();

       System.out.println("Binomial coffecient is:  " + binCoeff(n,r)); 
    }
    
}
