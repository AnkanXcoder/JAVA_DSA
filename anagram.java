
import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str1 = "Earth";
        String str2 = "Heart";
        //convert lowercase;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        //length check
        if(str1.length() == str2.length()){
            //convert string into char array
            char[] str1chararray = str1.toCharArray();
            char[] str2chararray = str2.toCharArray();
            //sort the char array
            Arrays.sort(str1chararray);
            Arrays.sort(str2chararray);
            // if same it is anagram
            Boolean result = Arrays.equals(str1chararray,str2chararray);
            if(result){
                System.out.println(str1 + " and " + str2 + " are anagrams of each other");
            }
            else{
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
            }
           

        }

    }
    
}
