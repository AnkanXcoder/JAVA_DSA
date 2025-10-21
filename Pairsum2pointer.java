import java.util.ArrayList;

public class Pairsum2pointer {
    public static boolean pairsum(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;
        while(lp < rp){
            // case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            // case 2
            else if(list.get(lp) + list.get(rp) < target){
                lp++;
            }
            // case 3
            else{
                rp--;
            }
        }
        return false;

    }
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 6; i++){
            list.add(i);
        }
        int target = 5;
        System.out.println(pairsum(list, target));
    }
}
