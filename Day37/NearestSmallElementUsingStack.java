import java.util.Stack;
//it takes time complexity is O(n)
public class NearestSmallElementUsingStack {
    public static void main(String[] args) {

        int arr[]={4,5,2,10,9};
        NearestSmallElement(arr);
        
    }

    static void NearestSmallElement(int arr[]) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<arr.length;i++) {
            
            while(!stack.isEmpty() && stack.peek()>arr[i])
             stack.pop();  

             if(stack.isEmpty())
              System.out.print(-1+" ");
             else 
               System.out.print(stack.peek()+" "); 
            stack.push(arr[i]);   
        }
    }
    
}
