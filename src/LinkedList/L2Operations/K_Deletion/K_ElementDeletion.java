package LinkedList.L2Operations.K_Deletion;




class  Nodee{
    int data;
    Nodee next;


    Nodee(int data){
        this.data=data;
        this.next=null;
    }

}
public class K_ElementDeletion {


    private static Nodee covertArray2LL(int[] arr ){
        Nodee head= new Nodee(arr[0]);
        Nodee temp = head;

        for(int i = 1; i<arr.length; i++){
            temp.next= new Nodee(arr[i]);
            temp  = temp.next;

        }
        return head;

    }

    private static void print(Nodee  head){
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
        System.out.println();
    }


    private static  Nodee DeleteKelement(Nodee head  , int  k ){
        if(head==null){
            return head ;

        }


        if(k==1){
            Nodee temp = head ;
            return head;

        }
        int cnt = 0 ;
        Nodee temp = head;
        Nodee previous = null;


        while(temp!=null){
            cnt++ ;


            if(cnt==k){
                previous.next= previous.next.next;
                break ;

            }
            previous = temp ;
            temp  = temp.next;

        }
        return head;



    }

    public static void main(String[] args) {
        int[] arr = {1, 8,4, 5, 6,};
        Nodee head = covertArray2LL(arr);
        head = DeleteKelement(head  , 3);
         print(head);

    }




}
