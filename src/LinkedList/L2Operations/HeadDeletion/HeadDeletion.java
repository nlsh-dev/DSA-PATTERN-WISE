package LinkedList.L2Operations.HeadDeletion;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static Node removeElement(Node head) {
        if (head == null) {
            return null;
        }

        head = head.next;
        return head;
    }
}

public class HeadDeletion {
    public static void main(String[] args) {
        int[] arr = {12, 4, 6, 8};

        Node head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }

        head = Node.removeElement(head);
        temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}