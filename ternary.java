
import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        String type = ((num % 2) == 0)? "Evan": "Odd";
        System.out.println("This number is a " + type);
    }

    
}
