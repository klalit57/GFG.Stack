package GFG;

public class LargestRectangularArea {
    public static int largestRectangularArea1(int [] arr){ //GFG Naive
         int res=0;
         int n=arr.length;
         for(int i=0;i<n;i++){
             int curr=arr[i];
             for(int j=i-1;j>=0;j--){
                 if(arr[j]>=arr[i]){
                     curr=curr+arr[i];
                 }
                 else{
                     break;
                 }
             }
             for(int j=i+1;j<n;j++){
                 if(arr[j]>=arr[i]){
                     curr=curr+arr[i];
                 }
                 else{
                     break;
                 }
             }
             res=Math.max(res,curr);
         }
         return res;
    }

    public static int largestRectangularArea2(int [] arr) {  //GFG Method-2 O(N)
        int n = arr.length;
        int res = 0;
        int curr;
        int tp;
        Stack s = new Stack();
        for (int i = 0; i < n; i++) {

            //Area is calculated for both side of elements which are in stack
            //items which dont have left greater not calculated here

            while (!s.isEmpty() && arr[i] <= arr[s.peek()]) {
                tp = s.pop();
                curr = arr[tp] * ((s.isEmpty() ? i : (i - s.peek() - 1)));
                res = Math.max(res, curr);
            }
            s.push(i);
        }
            while (!s.isEmpty()) {  //items which have left greater not calculated here
                tp = s.pop();
                curr = arr[tp] * ((s.isEmpty() ? n : (n - s.peek() - 1)));
                res = Math.max(res, curr);
            }
        return res;
    }
    public static void main(String [] args){
        int [] arr={6,2,5,4,1,5,6};
        System.out.println(largestRectangularArea1(arr));
        System.out.println(largestRectangularArea2(arr));

    }
}
