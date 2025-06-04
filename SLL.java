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
    //deleteAtBeg()
    public void deleteAtBeg(){
        if(head!=null){
            head=head.next;
        }
    }
    //deleteAtEnd()
    public void deleteAtEnd(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    //insertAtPos
    public void insertAtPos(int pos,int data){
        Node newNode=new Node(data);
        Node temp=head;
        int n=1;
        while(n<pos && temp.next!=null){
            temp=temp.next;
            n++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    //deleteAtPos
    public void deleteAtPos(int pos){
        Node temp=head;
        if(pos==1){
            head=head.next;
        }
        int n=1;
        while(n<pos-1 && temp!=null){
            temp=temp.next;
            n++;
        }
        temp.next=temp.next.next;
    }
   
}
 public class SLL{   
    public static void main(String[] args){
        SinglyLinkedList sl=new SinglyLinkedList();
        //insertAtBeg
        sl.insertAtBeg(28); 
        sl.insertAtBeg(10); 
        sl.insertAtBeg(30); 
        sl.insertAtBeg(40);
        //insertAtEnd
        sl.insertAtEnd(50); 
        sl.insertAtEnd(80);
        sl.insertAtEnd(100);
        //display
        sl.display();
        //deleteAtEnd and deleteAtBeg
        sl.deleteAtEnd();
        sl.deleteAtBeg();
        System.out.println();
        sl.display();
        System.out.println();
        //insertAtPos
        sl.insertAtPos(2,60);
        sl.display();
        System.out.println();
        //deleteAtPos
        sl.deleteAtPos(3);
        sl.display();
       }
}
