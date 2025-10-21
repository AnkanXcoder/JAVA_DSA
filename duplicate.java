public class Duplicate {
    public boolean  hasduplicate(int dup[]){
        for (int i = 0; i < dup.length-1; i++) {
            for (int j = i+1; j < dup.length; j++) {
                if(dup[i] == dup[j]){
                    return true;
                
                }
                
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        int dup[] = {2,4,5,8,9,2,2};
        Duplicate obj = new Duplicate();
        System.out.println(obj.hasduplicate(dup));

    }
    
}
