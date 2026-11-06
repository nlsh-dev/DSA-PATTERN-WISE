package StackQueueProblema;

import java.util.Arrays;

public class Solution {

    public int[] prevSmaller(int[] A) {

        int n = A.length;
        int[] ans = new int[n];

        for (int i = n - 1; i >= 0; i--) {

            ans[i] = -1;

            for (int j = i - 1; j >= 0; j--) {

                if (A[j] < A[i]) {
                    ans[i] = A[j];
                    break;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] A = {4, 5, 2, 10, 8};

        int[] result = obj.prevSmaller(A);

        System.out.println(Arrays.toString(result));
    }
}