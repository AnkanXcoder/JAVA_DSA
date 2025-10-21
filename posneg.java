
import java.util.Scanner;

public class posneg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        String type = ((num>0))? "Positive" : "Negative";
        System.out.println("This number is a " + type);
    }
    
}
