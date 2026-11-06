
package StackQueueProblema;

import java.util.Arrays;
import java.util.Stack;
class GreaterElement2UsingStack {

    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;

        int[] nge = new int[n];

        Arrays.fill(nge, -1);

        Stack<Integer> st = new Stack<>();

        // Traverse 2*n-1 to 0
        for (int i = 2 * n - 1; i >= 0; i--) {

            int ind = i % n;

            // Remove smaller or equal elements
            while (!st.isEmpty() && st.peek() <= nums[ind]) {
                st.pop();
            }

            // Store next greater element
            if (i < n) {
                if (!st.isEmpty()) {
                    nge[i] = st.peek();
                }
            }

            // Push current element
            st.push(nums[ind]);
        }

        return nge;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 4, 6};

        GreaterElement2 obj = new GreaterElement2();

        int[] result = obj.nextGreaterElements(nums);

        System.out.println(Arrays.toString(result));
    }
}
