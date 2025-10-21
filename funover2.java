import java.util.Scanner;

public class funover2 {

    public static int sum(int a , int b ){
        return a+b;
    }
    public static float sum(float a , float b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers number: ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println("Enter two floating number: ");
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        System.out.println("sum of two integers number: " + sum(p,q));
        System.out.println("sum of two floating number: " + sum(c,d));
        
    }
}
