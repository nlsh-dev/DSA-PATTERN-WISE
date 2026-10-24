
package LinkedList.Porblems;

import java.util.ArrayList;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class OddEvenNode {

    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ArrayList<Integer> arr = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {
            arr.add(temp.data);

            if (temp.next == null || temp.next.next == null) {
                break;
            }

            temp = temp.next.next;
        }

        temp = head.next;

        while (temp != null) {
            arr.add(temp.data);

            if (temp.next == null || temp.next.next == null) {
                break;
            }

            temp = temp.next.next;
        }

        temp = head;
        int i = 0;

        while (temp != null) {
            temp.data = arr.get(i);
            i++;
            temp = temp.next;
        }

        return head;
    }

    public static ListNode arrayToLinkedList(int[] arr) {
        if (arr.length == 0) {
            return null;
        }

        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }

        return head;
    }

    public static void printLinkedList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        ListNode head = arrayToLinkedList(arr);

        System.out.println("Original Linked List:");
        printLinkedList(head);

        OddEvenNode obj = new OddEvenNode();
        head = obj.oddEvenList(head);

        System.out.println("After Odd-Even Rearrangement:");
        printLinkedList(head);
    }
}
