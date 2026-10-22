package LinkedList.L2Operations.TailDeletion;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class TailDeletion {

    private static Node covertArray2LL(int[] arr) {
        if (arr.length == 0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }

        return head;
    }

    private static void print(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
        System.out.println();
    }

    static Node insertHead(Node head, int val) {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        return head;
    }

    private static Node TailDeletion(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        return head;
    }

    private static Node inserTail(Node head, int val) {
        Node newNode = new Node(val);

        if (head == null) {
            return newNode;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        Node head = covertArray2LL(arr);
        System.out.println("Original list:");
        print(head);

        head = insertHead(head, 10);
        System.out.println("After inserting at head:");
        print(head);

        head = inserTail(head, 20);
        System.out.println("After inserting at tail:");
        print(head);

        head = TailDeletion(head);
        System.out.println("After deleting from tail:");
        print(head);
    }
}