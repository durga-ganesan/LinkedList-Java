class SinglyLinkedList{
    //Node Structure
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }   
    //head 
    private Node head=null;
    //insertAtBeg()
    public void insertAtBeg(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    //insertAtEnd()
    public void  insertAtEnd(int data){
        Node newNode=new Node(data);
        Node temp=head;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=newNode;
    }
    //display()
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }System.out.print("null");
    }
    //findNthElementFromEnd(int N)
    public int findNthElementFromEnd(int N){
        int len=0;
        Node temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(N>len)
            return -1;
        temp=head;
        for(int i=0;i<len-N+1;i++){
            temp=temp.next;
        }
        return temp.data;
    }
}
 public class NthElementFromEnd{   
    public static void main(String[] args){
        SinglyLinkedList sl=new SinglyLinkedList();
        sl.insertAtBeg(28); 
        sl.insertAtBeg(10); 
        sl.insertAtBeg(30); 
        sl.insertAtBeg(40); 
        sl.insertAtEnd(50); 
        sl.display();
        System.out.println();
        int N=3;
        System.out.println(N+" Element From End = "+sl.findNthElementFromEnd(N));
       }
}
