
package LinkedList.Porblems;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MiddleNode {

    // Convert array into a linked list
    private static Node convertArrayToLinkedList(int[] arr) {

        if (arr.length == 0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }

        return head;
    }

    // Print the linked list
    private static void printLinkedList(Node head) {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    // Find the middle node
    private static Node middleNode(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5,6 };

        Node head = convertArrayToLinkedList(arr);

        System.out.println("Linked List:");
        printLinkedList(head);

        Node middle = middleNode(head);

        System.out.println("Middle Node: " + middle.data);
    }
}
