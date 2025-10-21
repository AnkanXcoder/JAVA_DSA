
import java.util.ArrayList;

public class Arraylistoperation {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        // add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        
        // get elments
        System.out.println(list.get(2));

        // remove elements
       list.remove(1);
        System.out.println(list);

        // set element at index
        list.set(1, 2);
        System.out.println(list);

        // contains element
       
        System.out.println( list.contains(1));
        System.out.println( list.contains(10));
        System.out.println(list.size());
        //print the array list
        for(int i = 0; i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

    }

}
