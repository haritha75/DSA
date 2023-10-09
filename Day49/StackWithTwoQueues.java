import java.util.ArrayDeque;
import java.util.Queue;

public class StackWithTwoQueues {

    Queue<Integer> queue1=new ArrayDeque<>();
    Queue<Integer> queue2=new ArrayDeque<>();

    private int count;
    private int top;

    public void push(int item) {

        queue1.add(item);
        top=item;
        count++;

    }

    public int pop() {

        if(isEmpty())
           throw new IllegalStateException();
        
        while(queue1.size()>1) {

          top=queue1.remove();
            queue2.add(top);
        }
        shiftTwoQueues();
        count--;
        return queue2.remove();      

    }
    private void shiftTwoQueues() {

        var temp=queue1;
        queue1=queue2;
        queue2=temp;
    }

    public int peek() {

        return top;
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    public int size() {
        return count;
    }
    public String toString() {

        return queue1.toString();
    }

    
}
