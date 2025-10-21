



public class practics{
    public static void printLetters(String str){
        for(int i = 0; i<str.length();i++){
            System.out.println(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
      /*   Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
      */
      //String fullName = "Ankan   sen";
      //System.out.println(fullName.length());
      String firstName = "Ankan";
      String lastName = "Sen";
      String fullname = firstName + " " + lastName;
      printLetters(fullname);
     


      



        
    }

}
