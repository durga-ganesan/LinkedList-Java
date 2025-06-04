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
    //deleteEveryKthElement()
    public void deleteEveryKthElement(int k){
        if(k==1){
            head=null;
        }
        Node temp=head;
        int n=2;
        while(temp!=null && temp.next!=null){
            if(n%k==0){
                temp.next=temp.next.next;
                n++;
            }
            else{
                temp=temp.next;
                n++;
            }
        }
    }
    
}
 public class DelEveryKthNode{   
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
        sl.deleteEveryKthElement(2);
        sl.display();
        
    }
}
