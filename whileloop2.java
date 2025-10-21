
import java.util.Scanner;

public class whileloop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter last range of while loop: ");
        int n = sc.nextInt();
        int i=1;
        while(i<=n)
        {
            System.out.println(i);
            i++;
        }

    }
    
}
