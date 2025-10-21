
import java.util.Scanner;

public class function1{
    public static int sumcal(int A , int B) {
        return A+B;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int A = sc.nextInt();
        System.out.println("Enter second number: ");
        int B = sc.nextInt();
        int result = sumcal(A,B);
        System.out.println("Sum is " + result);
        sc.close();

    }

}