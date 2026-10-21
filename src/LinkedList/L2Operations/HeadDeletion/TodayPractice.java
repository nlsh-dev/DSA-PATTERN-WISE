package LinkedList.L2Operations.HeadDeletion;


public class TodayPractice {
    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};

        System.out.println("Today's DSA Practice");
        System.out.println("Original array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nAfter removing the last element:");

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
