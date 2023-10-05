import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class ReverseQueue {
    public static void main(String[] args) {
        
       Queue<Integer> queue = new LinkedList<>();
       queue.add(22);
       queue.add(11);
       queue.add(99);
       queue.add(78);
       System.out.println(queue);
       reverse(queue);
       System.out.println(queue);

        
    }
    static void reverse(Queue<Integer> queue) {

        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty())
          stack.add(queue.remove());
        while(!stack.isEmpty())
          queue.add(stack.pop());  

    }
    
}
