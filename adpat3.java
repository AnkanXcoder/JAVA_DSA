import java.util.Scanner;
public class adpat3 {
    public static void numberpy(int r , int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r-i+1; j++) {
                
                    System.out.print(j+" ");
                    

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
    numberpy(r, c);

}
}
