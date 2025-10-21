
import java.util.Scanner;

public class primefun {
    public static boolean  prime(int n) {
        if(n==1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i<n;i++){
        if(n%i==0){
        return false;
        }
    }
        return true;

        
    }
    
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("This number is a prime = ? ");
        System.out.println(prime(n));
    }
}
