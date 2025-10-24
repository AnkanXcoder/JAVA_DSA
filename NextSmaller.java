import java.util.ArrayList;
import java.util.Stack;

public class NextSmaller {
    static ArrayList<Integer> nextSmallerElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>(n);

        // Initialize all results as -1
        for (int i = 0; i < n; i++) result.add(-1);

        Stack<Integer> st = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Pop all greater or equal elements
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            // If stack not empty → top is next smaller element
            if (!st.isEmpty()) {
                result.set(i, st.peek());
            }

            // Push current element
            st.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 8, 5, 2, 25};
        ArrayList<Integer> nse = nextSmallerElement(arr);

        System.out.println("Next Smaller Elements:");
        for (int x : nse) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

