
import java.util.Scanner;

public class primenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean is_prime = true;
        for(int i = 2;i<=num-1;i++){
            if(num % i == 0){
                is_prime = false;
            }
        }
        if(is_prime== true)
        {
            System.out.println("This is a prime number");
        }
        else
        {
            System.out.println("This is  not a prime number");
        }
    }
    
}
