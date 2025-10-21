public class Recursionincre {
    public static void increasingorder(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        increasingorder(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 5;
        increasingorder(n);
    }
    
}
