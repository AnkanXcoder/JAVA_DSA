
import java.util.ArrayList;
import java.util.Arrays;

public class MaxelementArrayList {
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 5, 7, 9, 6));
      
       int max = Integer.MIN_VALUE;
       for(int i = 0; i< list.size(); i++) {
        max = Math.max(max, list.get(i));
       }
       System.out.println(max);
    }
}
