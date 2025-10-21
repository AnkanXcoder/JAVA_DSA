
import java.util.Scanner;

public class funover {
    public static int sum(int a , int b){
        return a+b;

    }
    public static int sum(int a , int b , int c){

        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();
        System.out.println("Sum is two number: " + sum(a,b));
        System.out.println("Sum is three number: " + sum(a,b,c));
    }
    
}
