import java.util.Scanner;

public class isevan {

    public static boolean is_evan(int n){
        if(n % 2 == 0){
            return  true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer number: ");
        int n = sc.nextInt();
        System.out.println("This is a evan number: ");
        System.err.println(is_evan(n));

        
    }
    
}
