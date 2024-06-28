import java.util.Arrays;

import org.w3c.dom.Node;

public class Main {

    public static void main(String[] args) {
         LinkedList li = new LinkedList();
        li.addLast(10);
        li.addLast(20);
        li.addLast(10);
        li.addLast(40);
        li.addLast(10);
        li.addLast(40);
        li.addLast(10);
       
        
       
    //    li.kthNodeFormLast(3);
    //     li.middleNode();
        //LinkedList x= LinkedList.createLoop();

        //System.out.println(x.detectLoop());
       // System.out.println(x.detectLoop1());
      // li.lastIndexOf(10);
      System.out.println(li.size());
      li.addAt(11, 1);
      System.out.println(li.valueOf(1));
      System.out.println(li.size());

    }
    
}
