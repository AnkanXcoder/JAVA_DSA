
import java.util.Scanner;

public class rangeprime {
    
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
        public static void primeinrange(int a , int b){
            for(int i=a;i<=b;i++){
                if(prime(i)){
                    System.out.println(i + "");
                }
            }
            System.err.println();
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first range");
            int a = sc.nextInt();
            System.out.println("Enter last range");
            int b = sc.nextInt();
            primeinrange(a,b);
            
        }
    
}
