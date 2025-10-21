
import java.util.Scanner;

public class mulfun {
    public static int calculatemul(int a , int b) {
         
        int mul = a*b;
        return mul;

   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = sc.nextInt();
        System.out.println("Enter second number: ");
        int y = sc.nextInt();
        int result =  calculatemul(x, y);
        System.out.println("mulplication is " + result );

    }
}
