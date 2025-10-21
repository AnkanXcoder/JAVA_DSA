public class Optimizedpower {
    public static int optimize(int x, int n){
        if(n == 0){

            return 1;
        }
       int halfPower = optimize(x, n/2);
       int halfPowerSq = halfPower *halfPower;
       // n is odd
       if(n % 2 != 0){
        halfPowerSq = x*halfPowerSq;
       }
       return halfPowerSq;



    }

    public static void main(String[] args) {
        System.out.println(optimize(2, 5));
    }
}
