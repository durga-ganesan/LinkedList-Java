class SinglyLinkedList{
    //Node structure
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
    //getMiddle()
    public int getMiddle(){
        int length=0;
        Node temp=head;
        while(temp!=null){
            length+=1;
            temp=temp.next;
        }
        int midIndex=length/2;
        temp=head;
        while(midIndex>0){
            temp=temp.next;
            midIndex--;
        }
        return temp.data;
    }
}
 public class FindMid{   
    public static void main(String[] args){
        SinglyLinkedList sl=new SinglyLinkedList();
        //inserting elements
        sl.insertAtBeg(28); 
        sl.insertAtBeg(10); 
        sl.insertAtBeg(30); 
        sl.insertAtBeg(40); 
        sl.insertAtEnd(50); 
        //Display all the elements
        sl.display();
        System.out.println();
        //Display middle element
        System.out.println("Middle Element: "+sl.getMiddle());
       }
}
