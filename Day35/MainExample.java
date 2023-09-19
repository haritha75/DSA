import java.util.Arrays;

import org.w3c.dom.Node;

public class MainExample {

    public static void main(String[] args) {
          LinkedList l1 = new LinkedList();
          l1.addLast(1);
          l1.addLast(2);

        //   LinkedList l2=new LinkedList();
        //   l2.addLast(46);
        //   l2.addLast(54);

        //   LinkedList l3 = l1.joinTwoList1(l1, l2,l1.head);

         
        //   l3.traverse(l3.head);
        l1.addLast(3);
        l1.addLast(2);
        l1.addLast(1);

       //System.out.println(l1.isPalindrome1());
       System.out.println(l1.isPalindrome2());
       l1.intersectionPoint1();
       
    


    }
    
}
