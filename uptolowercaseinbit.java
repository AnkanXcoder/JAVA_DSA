public class uptolowercaseinbit {
    public static void main(String[] args) {
        //convert uppercase character to lowercase 
        for(char ch = 'A' ; ch<= 'Z';ch++){
            System.out.print((char)(ch|' '));

        }
        System.out.println();
        //convert lowercase character to uppercase
        for(char ch = 'a' ;ch<= 'z';ch++){
            System.out.println((char)(ch&'_'));
        }
    }
    
}
