
import java.util.Scanner;

public class multable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int mul = num*i;
            //System.out.println(mul);
            System.out.println("Multiplicaion table of " +  num  + "is " + mul);
            //System.out.println(mul);

        }
        //System.out.println("Multiplicaion table of " + num + "is " + multiplication);
        //System.out.println(mul);

        


    }
    
}
