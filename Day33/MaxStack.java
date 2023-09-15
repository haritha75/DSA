import java.util.Stack;

public class MaxStack {

    private Stack<Integer> stack = new Stack();
    private Stack<Integer> maxStack = new Stack();

    void push(int item) {
        stack.push(item);

        if(maxStack.isEmpty())
           maxStack.push(item);
        else if(item>maxStack.peek())  
           maxStack.push(item);
    }

    int pop() {

        if(stack.isEmpty())
          throw new IllegalStateException();
          var x= stack.peek();
          if(x==maxStack.peek())
            maxStack.pop();
        return x;    
    }

    int max() {

        if(maxStack.isEmpty())
          throw new IllegalStateException();
        return maxStack.peek();  

    }




}
    

