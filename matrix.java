
import java.util.Scanner;

public class matrix {
    public static boolean  search(int matrics[][] , int key){
        for(int i = 0; i < matrics.length; i++) {
            for (int j = 0; j < matrics[0].length; j++) {
                if(matrics[i][j] == key){
                    System.out.println("Item is found at index ("+i+","+j+")");
                    return  true;
                }
            }
        }
        System.out.println("Item not found!!");
        return false;
  }

    public static void main(String[] args) {
        int matrics[][] = new int[3][3];
        int n = matrics.length, m= matrics[0].length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrics[i][j] = sc.nextInt();
                
            }  
        }
        //output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrics[i][j] + " ");   
            } 
            System.out.println();

        }

        search(matrics, 25);

    }
    
}
