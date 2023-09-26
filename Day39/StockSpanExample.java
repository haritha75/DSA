import java.util.Stack;

public class StockSpanExample {
    public static void main(String[] args) {
        int a[]={3,5,1,15,9,2,13};
        StockSpan(a);
        System.out.println();
        StockSpan1(a);

        
    }

    public static void StockSpan(int a[]) {
        for(int i=0;i<a.length;i++) {
            int count=1;
            for(int j=i-1;j>=0;j--) {
                if(a[j]>a[i])
                  break;
                count++;  
            }
            System.out.print(count+" ");

        }
    }

    public static void StockSpan1(int[] a) {

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<a.length;i++) {

        while(!stack.empty() && a[i]>a[stack.peek()]) 
          stack.pop();
        
        if(stack.empty())  
          System.out.print(i+1+" ");
        else 
          System.out.print(i-stack.peek()+" ");  
        stack.push(i);  
        
       }
    }

}