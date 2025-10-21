public class FriendsPairing {
    public static int friendsPair(int n){
        if(n==1||n==2){
            return n;
        }
        //choice
        //single
        
        int fnm1 = friendsPair(n-1);
        // pair
        int fnm2 = friendsPair(n-2);
        int pairways = (n-1)*fnm2;
        //toways
        int toways = fnm1 + pairways;
        return  toways;
    }
  public static void main(String[] args) {
    System.out.println(friendsPair(6));
    
  }
}
