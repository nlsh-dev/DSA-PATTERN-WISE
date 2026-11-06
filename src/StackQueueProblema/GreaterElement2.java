
package StackQueueProblema;

import java.util.Arrays;

public class GreaterElement2 {

    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] nge = new int[n];

        Arrays.fill(nge, -1);

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < i + n; j++) {

                int ind = j % n;

                if (nums[ind] > nums[i]) {
                    nge[i] = nums[ind];
                    break;
                }
            }
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
