
import java.util.Stack;

public class VaildParenthesis {

    public static boolean isBalanced(String s) {
        Stack<Character> stk = new Stack<>();

        for(char c: s.toCharArray()) {
            if(c=='(' || c=='{' || c =='[') {
                stk.push(c);
            }

            else if(c == ')' || c == '}' || c == ']') {
                //No opening Bracket or empty stack
                if(stk.isEmpty()) {
                    return false;
                }
                char top = stk.peek();
                if((c==')' && top !='(') ||
                    (c=='}' && top !='{') ||
                    (c==']' && top !='[')) {
                        return false;
                }
                stk.pop();
            }
        }
        return stk.isEmpty();
    }
    public static void main(String[] args) {
        String s = "[()()]{}";
        System.out.println((isBalanced(s)? "true": "false"));
    }
}
