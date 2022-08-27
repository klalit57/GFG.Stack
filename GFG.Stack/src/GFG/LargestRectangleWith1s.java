package GFG;

public class LargestRectangleWith1s {
    public static int largestRectangleWith1s(int [][] arr){

        int n=arr.length;
        int res=largestRectangularArea(arr[0]);
        int curr;
        for(int i=1;i<n;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1) {
                    arr[i][j] = arr[i][j] + arr[i - 1][j];
                }
            }
           curr=largestRectangularArea(arr[i]);
            res=Math.max(curr,res);
        }
        return res;
    }

    public static int largestRectangularArea(int [] arr){
        int n=arr.length;
        Stack s= new Stack();
        int tp;
        int curr;
        int res=0;

        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[i]<=arr[s.peek()]){
                tp=s.pop();
                curr=arr[tp]* ((s.isEmpty()?i:(i-s.peek()-1)));
                res=Math.max(res,curr);
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            tp=s.pop();
            curr=arr[tp]* ((s.isEmpty()?n:(n-s.peek()-1)));
            res=Math.max(res,curr);
        }
        return res;
    }

    public static void main(String [] args){
        int [][] arr={{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0}};

        System.out.println(largestRectangleWith1s(arr));

    }
}
