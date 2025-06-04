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
    //reverse()
    public void reverse(){
        Node prev=null;
        Node current=head;
        Node next=null;
        while(current!=null){
            next=current.next;//store next
            current.next=prev;//reverse current
            prev=current;//prev to current
            current=next;//current to next
        }
        head=prev;
    }
    
}
 public class Reverse{   
    public static void main(String[] args){
        SinglyLinkedList sl=new SinglyLinkedList();
        sl.insertAtBeg(28); 
        sl.insertAtBeg(10); 
        sl.insertAtBeg(30); 
        sl.insertAtBeg(40); 
        sl.insertAtEnd(50); 
        sl.insertAtEnd(80);
        sl.insertAtEnd(100);
        sl.display();
        System.out.println();
        sl.reverse();
        sl.display();
        
    }
}
