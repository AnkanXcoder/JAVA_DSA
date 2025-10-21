
import java.util.Scanner;

public class adpat2 {
    public static void inpyramid(int r , int c){
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
            
           
            System.out.print("*");
            
        }
        System.out.println();
       
    }
}
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number:  ");
        int r = sc.nextInt();
        System.out.println("Enter coloumn number:  ");
        int c = sc.nextInt();
        inpyramid(r, c);

    }
}
