package LinkedList.L2Operations.TailDeletion;

class Node{
    int data;
    Node next;


    Node(int data){
        this.data= data;
        this.next= null;
    }
}
public class TailDeletion {

    private static Node covertArray2LL(int[] arr ){
        Node head= new Node(arr[0]);
        Node temp = head;

        for(int i = 1; i<arr.length; i++){
            temp.next= new Node(arr[i]);
            temp  = temp.next;

        }
        return head;

    }

    private static void print(Node  head){
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
        System.out.println();
    }

    private  static  Node TailDeletion(Node head){
        if (head==null|| head.next== null){
            return  null;

        }
        Node temp = head ;
        while(temp.next.next!=null){
            temp = temp.next;

        }
        temp.next= null;
        return head ;

    }




    public static void main(String[] args) {

        int[] arr = {1,  2, 3, 4 , 5};
        Node head= covertArray2LL(arr);
        head = TailDeletion(head);
        print(head);

    }
}
