import java.util.*;
public class bill{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int pen = sc.nextInt();
        int pencil = sc.nextInt();
        int eraser = sc.nextInt();
        int total = pen + pencil + eraser;
        System.out.println("total bill:" + total);
        float newTotal = total + (0.18f * total);
        System.out.println("Bill with 18% tax : " + newTotal);
                
            }
        }
        