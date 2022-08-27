package GFG;
import java.util.Stack;

class MyStack1{
    Stack<Integer> s;
    int min;
    MyStack1(){
        s=new Stack<>();
    }

    public void push(int x){
        if(s.isEmpty()){
            min=x;
            s.push(x);
        }
        else if(x<=min){
            s.push(x-min);
            min=x;
        }
        else{
            s.push(x);
        }
    }

    public int pop(){
        int t=s.pop();
        if(t<=0){
            int res=min;
            min=min-t;
            return res;
        }
        else{
            return t;
        }
    }

    public int peek(){
        int t=s.peek();
        if(t<=0){
            return min;
        }else{
            return t;
        }
    }
    public int getMin(){
        return min;
    }

}
public class StackWithGetMinNoExtraSpace1 {
    public static void main(String [] args){
        MyStack1 s = new MyStack1();
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
