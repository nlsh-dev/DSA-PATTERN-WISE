
package LinkedList.L2Operations.K_Deletion;

public class KthElementDeletion {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node deleteKthElement(Node head, int k) {
        if (head == null || k <= 0) {
            return head;
        }

        // Delete the first node
        if (k == 1) {
            return head.next;
        }

        Node temp = head;

        // Move to the (k - 1)th node
        for (int i = 1; temp != null && i < k - 1; i++) {
            temp = temp.next;
        }

        // Invalid position
        if (temp == null || temp.next == null) {
            return head;
        }

        // Delete the kth node
        temp.next = temp.next.next;

        return head;
    }

    static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Before deletion:");
        printList(head);

        int k = 3;
        head = deleteKthElement(head, k);

        System.out.println("After deleting position " + k + ":");
        printList(head);
    }
}
