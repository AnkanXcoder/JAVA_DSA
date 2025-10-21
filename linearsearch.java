public class linearsearch {

    public static int linearsearch (String fruits[] , String search ) {
        for(int i = 0; i < fruits.length; i++) {
            if(fruits[i].equals(search)){
                return i + 1;
            }
            
        }
        return -1;
        
    }

    public static void main(String[] args) {
        String fruits[] = {"Apple" , "Banana" , "Orange","Watermelon" , "mango"};
        String search = "mango";
        int index = linearsearch(fruits, search);
        if(index == -1){
            System.out.println("Fruit not found");
        }
        else{
            System.out.println("Fruits found at " + index);
        }
    }
    
}
