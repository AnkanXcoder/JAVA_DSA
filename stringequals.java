public class stringequals {
    public static void main(String args[]) {
        String s1 = "ANKAN";
        String s2 = "ANKAN";
        String s3 = new String("ANKAN");
       /*  if(s1 == s2){
            System.out.println("Strings are equals");
        }
        else{
            System.out.println("Strings are  not equals");
        }
            */
        
        if(s1.equals(s3)){
            System.out.println("Strings are equals");
        }
        else{
            System.out.println("Strings are not equals");
        }

    }
    
}
