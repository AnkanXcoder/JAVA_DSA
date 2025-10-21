import java.util.Scanner;

public class withoutabs {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
       /*  System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();
        */
        if(a<0){
            System.out.println((-a));
        }
        else{
            System.out.println(+a);
        }
        
    }
    
}
