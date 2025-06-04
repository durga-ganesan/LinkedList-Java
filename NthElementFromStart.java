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
    //findNthElementFromStart(int N)
    public int findNthElementFromStart(int N){
        if(N==1){
            return head.data;
        }
        Node temp=head;
        while(N>1){
            N--;
            temp=temp.next;
        }
        return temp.data;
    }
}
 public class NthElementFromStart{   
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
        System.out.println(N+" Element From Start = "+sl.findNthElementFromStart(N));
       }
}
