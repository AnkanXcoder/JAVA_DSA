
import java.util.Scanner;

public class swapfun {
    public static void swap(int x , int y) {
        int t;
        t = x;
        x = y;
        y = t;
        System.out.println("first number = " + x);
        System.out.println("second number = " + y);

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = sc.nextInt();
        System.out.println("Enter second number: ");
        int y = sc.nextInt();
       
        swap(x,y);
       


    }
}
