import java.util.Stack;

public class ClosestGreateElement {
    public static void main(String[] args) {
        int arr[]={12,13,10,15,7,11};
        stockSpan(arr);
        System.out.println();
        int a[]={17,10,5,15,3,19};
        closestGreaterEle(a);
        System.out.println();
        closestSmallerEleInd(a);
    }

    public static void stockSpan(int arr[]) {

        for(int i=0;i<arr.length;i++) {
            int span=1;

            for(int j=i-1;j>-1;j--) {

                if(arr[i]<arr[j])
                  break;
                span++;  
            }
            System.out.print(span+" ");
        }

    }

    public static void closestGreaterEle(int arr[]) {

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<arr.length;i++) {

            while(!stack.empty() && stack.peek()<arr[i])
              stack.pop();
             
            if(stack.empty())
               System.out.print(-1+" "); 
            else
              System.out.print(stack.peek()+" ");
             stack.push(arr[i]);     
        }

    }
    public static void closestSmallerEleInd(int arr[]) {

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<arr.length;i++) {

            while(!stack.empty() && arr[stack.peek()]<arr[i])
              stack.pop();
             
            if(stack.empty())
               System.out.print((i+1)+" "); 
            else
              System.out.print(i-stack.peek()+" ");
             stack.push(i);     
        }

    }
}