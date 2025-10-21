
import java.util.Scanner;

public class sumofdigit {
    public static int sum1(int n){
        int sumofdigit = 0;
        while(n > 0){
        
        int lastdigit = n % 10;
        sumofdigit = sumofdigit + lastdigit;
        n = n/10;
        }
        return sumofdigit ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("sum of number is " + sum1(n));

    }
    
}
