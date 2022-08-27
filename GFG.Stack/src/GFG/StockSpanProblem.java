package GFG;

public class StockSpanProblem { //span = index-index of left greater element
    public static void printSpan1(int [] arr){
        for(int i=0;i<arr.length;i++){
            int span=1;
            for(int j=i-1;j>=0 && arr[j]<=arr[i];j--){
                span++;
            }
            System.out.print(span+" ");
        }
        System.out.println();
    }

    public static void printSpan2(int [] arr){  //gfg efficient
        Stack s= new Stack();
        s.push(0);
        System.out.print(1+" ");
        for(int i=1;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            int span=s.isEmpty()?i+1:i-s.peek();
            System.out.print(span+" ");
            s.push(i);
        }
    }


 public static void main(String [] args){
     int [] arr= {13,15,12,14,16,8,6,4,10,30};
     printSpan1(arr);

     printSpan2(arr);
 }
}
