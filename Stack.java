class StackOperations{
    //class- Node
    static class Node{
        int data;//4 
        Node next;//12
        Node(int data){
            this.data=data;
        }
    }   
    // top
    private Node top=null;
    // push()
    public void push(int data){
        Node newNode=new Node(data);
        newNode.next=top;
        top=newNode;
    }
    // pop()
    public void pop(){
        System.out.println(top.data);
        top=top.next;
    }
    // peek()
    public int peek(){
        return top.data;
    }
    // display()
    public void display(){
        Node temp=top;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }System.out.println("null");
    }
}
public class Stack{
    public static void main(String[] args){
        StackOperations S=new StackOperations();
        S.push(10);
        S.push(20);
        S.push(30);
        S.push(40);
        S.push(50);
        S.display();
        System.out.println("Top Element: "+ S.peek());
        S.pop();
        S.display();
    }
}
