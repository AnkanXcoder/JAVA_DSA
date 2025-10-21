
import java.util.Scanner;

public class factfun {
    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact*i;
            
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int result = fact(n);
        System.out.println("Factorial of number is: " +  result);

    }
}
