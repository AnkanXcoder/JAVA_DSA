import java.util.ArrayList;
import java.util.Collections;

public class SortingArraylist {
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(100);
        list.add(8);
        list.add(2);
        list.add(6);
        System.out.print(list);
        System.out.println();
        Collections.sort(list); // asedending
        System.out.print(list);
        System.out.println();
        // decending
        Collections.sort(list,Collections.reverseOrder());
        System.out.print(list);
    }
}
