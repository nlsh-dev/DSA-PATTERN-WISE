
class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class TailDeletionExample {

    static Node1 deleteTail(Node1 head) {

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return null;
        }

        Node1 temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

        return head;
    }

    static void printList(Node1 head) {
        Node1 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node1 head = new Node1(10);
        head.next = new Node1(20);
        head.next.next = new Node1(30);
        head.next.next.next = new Node1(40);

        System.out.println("Before deletion:");
        printList(head);

        head = deleteTail(head);

        System.out.println("After deletion:");
        printList(head);
    }
}
