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
         
        
        li.previousNode(32);
        li.previousNode(40);
        System.out.println(li.nextNode(57));
        System.out.println(li.nextNode(22));
    }
    
}
