
import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if(age>=50)
        {
            System.out.println("Old");
        }
        else if(age>=18)
        {
            System.out.println("Adult");

        }
        else if(age>=13)
        {
            System.out.println("Teenageer");
        }
        else
        {
            System.out.println("Child");
        }

    }
    
}
