import java.util.Arrays;

import org.w3c.dom.Node;

public class Main {

    public static void main(String[] args) {
         LinkedList li = new LinkedList();
         li.addLast(22);
         li.addLast(40);
         li.addLast(28);
         li.addLast(57);  
         li.addLast(32); 
         
        //  li.removeLast();

        //  //System.out.println(li.contains(22));
        //  System.out.println(li.valueOf(3));
        //  //System.out.println(li.getIndex(11));
        //  System.out.println(li.size());
        //  li.reverse();
        //  System.out.println(li.valueOf(0));
        // System.out.println(li.size());
        // li.middleNode();
        // li.kthNodeFormLast(1);
        li.previousNode(32);
        System.out.println(li.nextNode(57));
    }
    
}
