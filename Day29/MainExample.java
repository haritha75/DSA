import java.util.Arrays;

import org.w3c.dom.Node;

public class MainExample {

    public static void main(String[] args) {
          LinkedList l1 = new LinkedList();
          l1.addLast(43);
          l1.addLast(33);

        //   LinkedList l2=new LinkedList();
        //   l2.addLast(46);
        //   l2.addLast(54);

        //   LinkedList l3 = l1.joinTwoList1(l1, l2,l1.head);

         
        //   l3.traverse(l3.head);

        l1.addLast(56);
        l1.addLast(98);

       // l1.keyValues(2);
       //l1.reverse();
      //  l1.keyReverse(4);
      //  l1.printValues();

      //l1.reverseKNodes(2);
     // l1.printValues();
    // l1.printValues();
    l1.reverseNodes(2);
    l1.printValues();
       
    


    }
    
}
