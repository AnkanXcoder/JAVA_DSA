
import java.util.Scanner;

public class largest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int A = sc.nextInt();
        System.out.println("Enter Second number: ");
        int B = sc.nextInt();
        System.out.println("Enter Third  number: ");
        int C = sc.nextInt();
        if(A>=B && A>=C)
        {
            System.out.println(A + "is largest number");
        }
        else if(B>=A && B>=C)
        {
            System.out.println(B + "is largest number");
        }
        else 
        {

            System.out.println(C + "is largest number");
        }
    }
    
}
