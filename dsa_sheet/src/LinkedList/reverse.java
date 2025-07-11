package LinkedList;


class Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
        this.next=null;
    }
}
class LinkedList{
    public static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void print(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    public static Node create(int arr[]){
        int n=arr.length;
        if(n==0) return null;

        Node head=new Node(arr[0]);
        Node curr= head;
        for(int i=1; i<n; i++){
            curr.next=new Node(arr[i]);
            curr=curr.next;
        }
        return head;
    }
}
public class reverse {
    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        int arr[]={1,2,3,4,5};
        Node head=ll.create(arr);
        System.out.println("original: ");
        ll.print(head);

        Node reverse= ll.reverse(head);
        System.out.println("reversed");
        ll.print(reverse);
    }
}