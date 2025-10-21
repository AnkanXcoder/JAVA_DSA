public class SumN {
    public static int printsum(int n){
        if(n == 1){
            return 1;
        }
        int snm1 = printsum(n-1);
        int sn = n+printsum(n-1);
        return sn;

    }
    public static void main(String[] args) {
        int n;
        System.out.println(printsum(10));
    }
    
}
