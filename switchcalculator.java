
import java.util.Scanner;

public class switchcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second number: ");
        int b = sc.nextInt();
        System.out.println("Enter input (+,-,*,/,%)");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
            System.out.println("Result:" +(a+b));
            break;
            case '-':
            System.out.println("Result:" +(a-b));
            break;
            case '*':
            System.out.println("Result:" +(a*b));
            break;
            case '/':
            System.out.println("Result:" +(a/b));
            break;
            case '%':
            System.out.println("Result: " +(a%b));
            break;
            default:
                System.out.println("Select right input!!");
        }

    }
    
}
