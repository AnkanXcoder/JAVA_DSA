
import java.util.Scanner;

public class optimizeprime {
    
    public static boolean  prime(int n) {
        if(n==1){
            return false;

        }
        if(n==2){
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i==0){
                return false;

            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a number: ");
        int n = sc.nextInt();
        System.out.println("This a prime number? ");
        System.err.println(prime(n));
    }
}
