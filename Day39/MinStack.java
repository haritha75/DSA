import java.util.Stack;

public class MinStack {
    public static void main(String[] args) {
        
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        stack.push(2);
        stack.push(0);
        stack.push(12);
        stack.push(54);
        stack.push(58);

        int min=Integer.MAX_VALUE;
        while(!stack.isEmpty()) {
            if(stack.peek()<min)
              min=stack.peek();

           stack.pop();   
        }
        System.out.println(min);
    }
    
}
