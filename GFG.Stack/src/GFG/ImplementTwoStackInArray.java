package GFG;

class TwoStack{
    int [] arr;
    int cap;
    int top1;
    int top2;
    TwoStack(int n){
        cap=n;
        top1=-1;
        top2=cap;
        arr= new int[n];
    }

    void push1(int x){
        if(top1<top2-1){
            top1++;
            arr[top1]=x;
        }
    }
    void push2(int x){
        if(top1<top2){
            top2--;
            arr[top2]=x;
        }
    }
    int pop1(){
        if(top1>=0){
            int x=arr[top1];
            top1--;
            return x;
        }else{
            return Integer.MAX_VALUE;
        }
    }
    int pop2(){
        if(top2<cap){
            int x=arr[top2];
            top2++;
            return x;
        }else{
            return Integer.MAX_VALUE;
        }
    }
    int peek1(){
        if(top1>=0){
            return arr[top1];
        }else{
            return Integer.MAX_VALUE;
        }
    }
    int peek2(){
        if(top2<cap){
            return arr[top2];
        }else{
            return Integer.MAX_VALUE;
        }
    }
}

public class ImplementTwoStackInArray {
    public static void main(String [] args){
        TwoStack obj= new TwoStack(10);
        obj.push1(20);
        System.out.println(obj.peek1());
        obj.push1(30);
        System.out.println(obj.peek1());
        obj.push2(40);
        System.out.println(obj.peek2());
        obj.push1(50);
        System.out.println(obj.peek1());
        obj.push2(60);
        System.out.println(obj.peek2());
        obj.push1(70);
        System.out.println(obj.peek1());
        obj.push2(80);
        System.out.println(obj.peek2());
        obj.push1(90);
        System.out.println(obj.peek1());
        obj.push1(100);
        System.out.println(obj.peek1());
        obj.push2(0);
        System.out.println(obj.peek2());


    }
}
