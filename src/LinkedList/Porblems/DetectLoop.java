
package LinkedList.Porblems;

import java.util.HashMap;
import java.util.Map;

public class DetectLoop {

    static class Node1 {
        int data;
        Node1 next;

        Node1(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node1 convertArrToLL(int[] arr) {

        if (arr.length == 0) {
            return null;
        }

        Node1 head = new Node1(arr[0]);
        Node1 temp = head;

        for (int i = 1; i < arr.length; i++) {
            Node1 newNode = new Node1(arr[i]);
            temp.next = newNode;
            temp = newNode;
        }

        return head;
    }

    public static void printLL(Node1 head) {

        Node1 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static boolean hasCycle(Node1 head) {

        Map<Node1, Integer> mpp = new HashMap<>();

        Node1 temp = head;

        while (temp != null) {

            if (mpp.containsKey(temp)) {
                return true;
            }

            mpp.put(temp, 1);
            temp = temp.next;
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        Node1 head = convertArrToLL(arr);

        Node1 temp = head;
        Node1 second = head.next;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = second;

        System.out.println("Has Cycle: " + hasCycle(head));
    }
}
