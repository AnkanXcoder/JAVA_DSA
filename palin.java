
import java.util.Scanner;

public class palin {
    public static boolean ispalindrome(int num){
        int original = num;
        int reverse = 0;
        while(num != 0){
            int remainder = num % 10;
            reverse = reverse*10+remainder; 
            num = num/10;
        }
        return original == reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(ispalindrome(num)){
            System.out.println( num  +  " is palindrome");
        }
        else{
            System.out.println( num  + "is not a palindrome");
        }
        sc.close();
    }
    
}
