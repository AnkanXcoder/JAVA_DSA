public class bitoddevan {
    public static void evenorOdd(int n) {
        int bitmask = 1;
        if((n & bitmask) == 1){
            //even
            System.out.println( n +" is a odd number");     
        }
        else{
            System.out.println(n + " is a even number");
        }
        
    }
    public static void main(String[] args) {
        evenorOdd(5);
        evenorOdd(10);
        evenorOdd(11);
        
    }
    
}
