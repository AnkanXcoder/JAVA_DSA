
import java.util.Scanner;

public class passfailternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks out of 100: ");
        int marks = sc.nextInt();
        String reportcard = (marks>=33)? "PASS" : "FAIL";
        System.out.println(reportcard);
    }
    
}
