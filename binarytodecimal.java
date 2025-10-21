
import java.util.Scanner;

public class binarytodecimal {
    public static void bintoDec(int n){
        int pow = 0;
        int decnum = 0;
        while(n>0){
            int lastdigit = n % 10;
            decnum = decnum + (lastdigit *(int) Math.pow(2,pow));
            pow++;
            n = n/10;
        }
        System.out.println("Decimal number is =  " + decnum );
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int n = sc.nextInt();
        bintoDec(n);
               
            }
        

        }
