import java.util.ArrayDeque;
import java.util.Deque;
 //Deque means double ended queue that means we can add both side and also remove both sides.
public class Dequeue {

    public static void main(String[] args) {
        
        Deque<Integer> deque=new ArrayDeque<>();

        deque.addLast(31);
        deque.addFirst(62);
        deque.addLast(75);
        deque.addLast(87);
        deque.addFirst(75);
        deque.add(43); //here add and addlst do the same work that means  add at last only.
        System.out.println(deque);
        
        deque.remove(); //here remove and removefast do the same work means it removes first element.
        System.out.println(deque);

        deque.removeFirst();
        System.out.println(deque);

        deque.removeLast();
        System.out.println(deque);



    }
}