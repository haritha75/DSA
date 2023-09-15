import java.util.Stack;

public class MinStack {

    private Stack<Integer> stack = new Stack();
    private Stack<Integer> minStack = new Stack();

    void push(int item) {
        stack.push(item);

        if(minStack.isEmpty())
           minStack.push(item);
        else if(item<minStack.peek())  
           minStack.push(item);
    }

    int pop() {

        if(stack.isEmpty())
          throw new IllegalStateException();
          var x= stack.peek();
          if(x==minStack.peek())
            minStack.pop();
        return x;    
    }

    int min() {

        if(minStack.isEmpty())
          throw new IllegalStateException();
        return minStack.peek();  

    }




}