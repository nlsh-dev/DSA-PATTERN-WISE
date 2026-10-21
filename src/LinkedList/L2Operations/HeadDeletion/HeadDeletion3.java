package LinkedList.L2Operations.HeadDeletion;

class Node4 {
    int data;
    Node4 next;

    Node4(int data) {
        this.data = data;
        this.next = null;
    }
}

public class HeadDeletion3 {

    private static Node4 convertArr2LL(int[] arr) {
        Node4 head = new Node4(arr[0]);
        Node4 temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node4(arr[i]);
            temp = temp.next;
        }

        return head;
    }




    ///HEAD DELETION
    private static Node4 removesHead(Node4 head) {
        if (head == null) {
            return head;
        }

        head = head.next;
        return head;
    }



    //TAIL DELETION
    private static  Node4 removeTail(Node4 head){
        if(head==null|| head.next==null){
            return null ;

        }

        Node4 temp = head;
        while(temp.next.next!=null){
            temp = temp.next;

        }
        temp.next= null;
        return head;



    }

    private static void print(Node4 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};

        Node4 head = convertArr2LL(arr);
        head = removeTail(head);

//        head = removesHead(head);
        print(head);

    }
}