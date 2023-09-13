import java.util.Stack;

public class StackOperations {

    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack();

        stack.push(67);
        stack.push(33);
        stack.push(11);
        stack.push(12);

        var top=stack.pop();
        System.out.println(top);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.search(33));

        while(!stack.isEmpty())
           stack.pop();
        System.out.println(stack);   

    }
    
}
