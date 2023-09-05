import java.util.Arrays;

import org.w3c.dom.Node;

public class MainExample {

    public static void main(String[] args) {
          LinkedList li = new LinkedList();
          li.addLast(43);
          li.addLast(33);

          li.insertLastRecursion(li.head, 11);
          li.removeLastRec(li.head);
          li.insertAtRight(11);
          li.insertAtRight(22);
          li.traverse(li.head);
       
    


    }
    
}
