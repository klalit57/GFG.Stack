package GFG;

public class PreviousGreater {
    public static void previousGreater1(int [] arr){  //MyCode
        Stack s=new Stack();
        s.push(0);
        System.out.print(-1+" ");
        for(int i=1;i<arr.length;i++){
            while(!s.isEmpty() && arr[i]>arr[s.peek()]){
              s.pop();
            }
            int preGreater=(s.isEmpty())?-1:arr[s.peek()];
            System.out.print(preGreater+" ");
            s.push(i);
        }
        System.out.println();
    }

    public static void previousGreater2(int [] arr){  //GFG Naive
        for(int i=0;i<arr.length;i++){
            int j;
            for(j=i-1;j>=0;j--){
                if(arr[j]>arr[i]){
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
            if(j==-1){
                System.out.print(-1+" ");
            }
        }
        System.out.println();
    }

    public static void previousGreater3(int [] arr){  //GFG efficient  O(N)
        Stack s=new Stack();
        s.push(arr[0]);
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[i]>=s.peek()){
                s.pop();
            }
            int preGreater=(s.isEmpty())?-1:s.peek();
            System.out.print(preGreater+" ");
            s.push(arr[i]);
        }
        System.out.println();
    }

    public static void main(String [] args){
        int [] arr= {5,10,18,12,4,6,2,8};

        previousGreater1(arr);
        previousGreater2(arr);
        previousGreater3(arr);
    }
}
