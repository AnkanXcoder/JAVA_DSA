public class getiThbit {
    public static int getithbit(int n, int i) {
        
        int bitmask = 1<<i;
        if((n&1<<i) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
 public static void main(String[] args) {
    System.out.println(getithbit(5,3));
 }
}
