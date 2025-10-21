import java.util.Scanner;

public class dectobin {
    public static void dectoBin(int n){
        int pow = 0;
        int binnum = 0;
        while(n>0){
            int remainder = n % 2;
            binnum = binnum + (remainder * (int) Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        System.out.println("Binary  number is =  " + binnum );
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int n = sc.nextInt();
        dectoBin(n);
               
            }
        

        }

    

