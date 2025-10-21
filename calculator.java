import java.util.Scanner;
public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b =sc.nextInt();
        System.out.println("sum = "+(a+b));
        System.out.println("sub = "+(a-b));
        System.out.println("mul = "+(a*b));
        System.out.println("Div = "+(a/b));
        System.out.println("modulo = "+(a%b));
        
    }
    
}
