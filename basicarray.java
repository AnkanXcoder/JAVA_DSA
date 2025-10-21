public class basicarray {
    public static void update(int marks[]){
        int unchage  = 20 ;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
            
        }
    }
    
    public static void main(String[] args) {
        int marks[] = { 10 , 11 , 14 };
        int unchange = 10; 
        update(marks);
        for (int i = 0; i < marks.length; i++){  
        
        System.out.println(marks[i]);
    }
    System.out.println(unchange);
}
}
