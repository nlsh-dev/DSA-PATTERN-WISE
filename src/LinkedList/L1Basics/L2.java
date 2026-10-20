
package LinkedList.L1Basics;

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class L2 {
    public static void main(String[] args) {

        int[] arr = {15, 8, 32, 5, 47, 21};

        Node1 head = new Node1(arr[0]);
        Node1 temp = head;

        // Create the Linked List
        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node1(arr[i]);
            temp = temp.next;
        }

        // Traverse the Linked List
        temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
