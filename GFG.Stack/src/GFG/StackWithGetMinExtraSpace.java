package GFG;
import java.util.Stack;
class MyStack{
    Stack<Integer> ms;
    Stack<Integer> as;
    MyStack(){
        ms= new Stack<>();
        as= new Stack<>();
    }

    public void push(int x){
        if(ms.isEmpty()){
            ms.add(x);
            as.add(x);
            return;
        }
        ms.add(x);
        if(as.peek()>= ms.peek()){
            as.add(x);
        }
    }

    public void pop(){
        if(as.peek()== ms.peek()){
            as.pop();
        }
        ms.pop();
    }

    public int peek(){
        if(ms.isEmpty()){
            return Integer.MAX_VALUE;
        }
        return ms.peek();
    }

    public int getMin(){
        return as.peek();
    }
}

public class StackWithGetMinExtraSpace {
    public static void main(String [] args) {
        MyStack s = new MyStack();
        s.push(10);
        System.out.println(s.peek() + " " + s.getMin());

        s.push(5);
        System.out.println(s.peek() + " " + s.getMin());

        s.push(15);
        System.out.println(s.peek() + " " + s.getMin());


        s.push(20);
        System.out.println(s.peek() + " " + s.getMin());

        s.push(8);
        System.out.println(s.peek() + " " + s.getMin());

        s.push(3);
        System.out.println(s.peek() + " " + s.getMin());

        s.push(30);
        System.out.println(s.peek() + " " + s.getMin());

        s.push(90);
        System.out.println(s.peek() + " " + s.getMin());

        s.push(1);
        System.out.println(s.peek() + " " + s.getMin());

    }
}
