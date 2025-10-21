
import java.util.Scanner;

public class adpat1 {

    public static void hollow_rectangle(int r , int c){
        for (int i = 1; i <= r; i++) {
            //outer loop
            for (int j = 1; j <= c; j++) {
                //inner loop
                if(i == 1 || i == r || j == 1 || j == c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows no: ");
        int r = sc.nextInt();
        System.out.println("Enter coloums no: ");
        int c = sc.nextInt();
        hollow_rectangle(r, c);
    }
    
}
