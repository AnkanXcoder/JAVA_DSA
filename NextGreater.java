import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreater {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        Map<Integer, Integer> nextGreater = new HashMap<>();
        Stack<Integer> stk = new Stack<>();

        // Step 1: Build map for nums2
        for (int i = n - 1; i >= 0; i--) {
            int num = nums2[i];

            // Remove smaller or equal elements
            while (!stk.isEmpty() && stk.peek() <= num) {
                stk.pop();
            }

            // Find next greater element
            int next = stk.isEmpty() ? -1 : stk.peek();
            nextGreater.put(num, next);

            // Push current number
            stk.push(num);
        }

        // Step 2: Fill result for nums1
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = nextGreater.get(nums1[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        NextGreater sol = new NextGreater(); // ✅ class name fixed

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 1, 2};

        int[] result = sol.nextGreaterElement(nums1, nums2); // ✅ method name fixed

        System.out.print("Next Greater Elements: ");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
