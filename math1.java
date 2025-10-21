
import java.util.Scanner;

public class math1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int a = sc.nextInt();
        System.out.println("Enter a second number: ");
        int b = sc.nextInt();
        System.out.println("maxima is " + (int)Math.max(a,b));
        System.out.println("minima is " + (int)Math.min(a,b));
        System.out.println("Squarroot of  " + a +" is " +(float) Math.sqrt(a));
        System.out.println("Squarroot of  " + b +" is " +(float) Math.sqrt(b));
        System.out.println("pow " + a + " to the power 2 is   " +(int) Math.pow(a, 2));
        System.out.println("pow " + b + "to the power 5 is   " +(int) Math.pow(b, 5));
        System.out.println("Abs is " +  Math.abs(a));
        sc.close();


    
    
}
}
