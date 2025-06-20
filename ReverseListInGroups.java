class SinglyLinkedList{
    //class- Node
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
    public void insertAtBeg(int data){//5
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    //display()
    public void display(){
        Node temp=head;//4000-
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }System.out.print("null");
    }   
    //reverseInGroup()
    public void reverseInGroups(int k) {
    head = reverseGroup(head,k);
    }
    //reverseGroup()
    private Node reverseGroup(Node head,int k) {
        Node current=head;
        Node prev=null;
        Node next=null;
        Node temp=head;
        int count=0;
        while(count<k && temp!=null){
            temp=temp.next;
            count++;
        }
        if(count<k) return head; 
        count=0;
        while(count<k && current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            count++;
        }
        if(next!=null){
            head.next=reverseGroup(next,k);
         }
        return prev; 
    }
    public static void main(String[] args){
        SinglyLinkedList sl=new SinglyLinkedList();
        sl.insertAtBeg(5); 
        sl.insertAtBeg(6); 
        sl.insertAtBeg(7); 
        sl.insertAtBeg(8); 
        sl.insertAtBeg(9); 
        sl.display();
        System.out.println();
        sl.reverseInGroups(2);
        sl.display();
    }
}
