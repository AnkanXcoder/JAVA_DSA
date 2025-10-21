public class linstr {
    public static int linear(String fruit[], String key) {
        for(int i = 0; i < fruit.length; i++) {

            if(fruit[i].equals(key)){
                return i;
            }
            
            
        }
        return -1;
        
    }




    public static void main(String[] args) {
        String fruit[] = {"Mango", "Orange", "Banana", "Guava", "Grapas", "Lichi", "Watermelon"};
        String key = "Orange";
        int index = linear(fruit, key);
        if(index == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Fruit is found at index " + index);
        }
    }
    
}
