package GFG;

public class NextGreaterElement {
    public static void nextGreater1(int [] arr){  //MyCode

        int n=arr.length-1;

        Stack s=new Stack();
        s.push(n);

        int [] res= new int[n+1];
        int j=n;
        res[j]=-1;
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            j--;
            int nextGreater=(s.isEmpty())?-1:arr[s.peek()];
            res[j]=nextGreater;
            s.push(i);
        }
        for(int x=0;x<=n;x++){
            System.out.print(res[x]+" ");
        }
        System.out.println();
    }

    public static void nextGreater2(int [] arr){ //GFG Naive
        for(int i=0;i<arr.length;i++){
            int j;
            for(j=i+1;j< arr.length;j++){
                if(arr[j]>arr[i]){
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
            if(j== arr.length){
                System.out.print(-1+"");
            }
        }
        System.out.println();
    }

    public static void nextGreater3(int [] arr){
        int n=arr.length;
        Stack s= new Stack();
        s.push(arr[n-1]);
        System.out.print(-1+" ");
        for(int i=n-2;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            int nextGreater=(s.isEmpty())?-1:s.peek();
            System.out.print(nextGreater+" ");
            s.push(arr[i]);
        }
    }

    public static void main(String [] args){
        int [] arr= {5,15,10,8,6,12,9,18};
        nextGreater1(arr);
        nextGreater2(arr);
        nextGreater3(arr);
    }
}
