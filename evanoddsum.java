
import java.util.Scanner;

public class evanoddsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number of elements: ");
        int n = sc.nextInt();
        int[] number = new int[n];
        int evansum = 0 , oddsum = 0;
        System.out.println("Enter" + n + "integers");
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
            if(number[i] % 2 == 0)
            {
                evansum += number[i];
            }
            else{
                oddsum += number[i];
            }

        }
        System.out.println("Evan sum is = " + (evansum));
        System.out.println("Odd sum is = " + (oddsum));



    }
    
}
