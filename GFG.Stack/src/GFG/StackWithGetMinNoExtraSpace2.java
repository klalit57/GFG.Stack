package GFG;

import java.util.*;
import java.util.Stack;

class MyStack2{
    Stack<Integer> s;
    int min;
    MyStack2(){
        s=new Stack<>();
    }

    public void push(int x){
        if(s.isEmpty()){
            min=x;
            s.push(x);
        }else if(x<=min){
            s.push(2*x-min);
            min=x;
        }else{
            s.push(x);
        }
    }

    public int pop(){
        int t=s.pop();
        if(t<=min){
            int res=min;
            min=2*min-t;
            return res;
        }else{
            return t;
        }
    }
    public int peek(){
        int t=s.peek();
        if(t<=min){
            return min;
        }else{
            return t;
        }
    }
    public int getMin(){
        return min;
    }
}

public class StackWithGetMinNoExtraSpace2 {

    public static void main(String [] args){

    }
}
