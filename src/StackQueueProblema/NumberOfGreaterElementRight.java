
package StackQueueProblema;

import java.util.ArrayList;
import java.util.List;

public class NumberOfGreaterElementRight {

    public List<Integer> count_NGE(int[] arr, int[] indices) {

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < indices.length; i++) {

            int index = indices[i];
            int count = 0;

            for (int j = index + 1; j < arr.length; j++) {

                if (arr[j] > arr[index]) {
                    count++;
                }
            }

            ans.add(count);
        }

        return ans;
    }

    public static void main(String[] args) {

        NumberOfGreaterElementRight obj =
                new NumberOfGreaterElementRight();

        int[] arr = {3, 4, 2, 7, 5, 8, 10, 6};
        int[] indices = {0, 5};

        List<Integer> result = obj.count_NGE(arr, indices);

        System.out.println(result);
    }
}
