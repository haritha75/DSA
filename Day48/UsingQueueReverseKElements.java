import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UsingQueueReverseKElements {

    public static void main(String[] args) {

        Queue<Integer> queue=new LinkedList<>();

        queue.add(11);
        queue.add(22);
        queue.add(13);
        queue.add(43);
        queue.add(65);
        System.out.println(queue);


        reverseKelements(queue,2);
        System.out.println(queue);
        
    }

    public static void reverseKelements(Queue<Integer> queue,int k) {

        if(k<0 || k> queue.size())
           throw new IllegalStateException();

        Stack<Integer> stack = new Stack<>();   

        for(int i=0;i<k;i++) {
            stack.push(queue.remove());
        }

        while(!stack.isEmpty()) 
          queue.add(stack.pop());

        for(int i=0;i<queue.size()-k;i++) {
            queue.add(queue.remove());
        }   

    }

}