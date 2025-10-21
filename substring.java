public class substring {
    public static String Substring(String str,int si, int ei){
        String substr = "";
        for(int i = si ; i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
  public static void main(String[] args) {
    String str = "I AM ANKAN SEN";
    System.out.println(Substring(str, 4, 10));
    System.out.println(str.substring(0, 10));
  }
}
