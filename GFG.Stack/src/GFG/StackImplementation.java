package GFG;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Stack{
    int size;
    Node Top;

    Stack(){
        size=0;
        Top=null;
    }

    boolean isEmpty(){
        return size==0;
    }

    int size(){
        return size;
    }

    public void push(int x){
        Node newNode=new Node(x);
            newNode.next=Top;
            Top=newNode;
        size++;
    }

    public int pop(){
        if(isEmpty()){
            return Integer.MAX_VALUE;
        }
        Node temp=Top;
        Top=Top.next;
        size--;
        return temp.data;
    }

    public int peek(){
        if(isEmpty()){
            return Integer.MAX_VALUE;
        }
        return Top.data;
    }
}

public class StackImplementation {

}
