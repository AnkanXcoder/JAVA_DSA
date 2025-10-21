
import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int reversed = 0 , remainder;
        while(num != 0)
        {
            remainder = num % 10;
            reversed = reversed*10+remainder;
            num = num/10;
        }
        System.out.println("Reversed num is: " + reversed);
    }
    
}
