public class Main {
    public static void main(String[] args) {
        CircularLinkedList cl=new CircularLinkedList();

        cl.addLast(99);
        cl.addLast(23);
        cl.addLast(11);
        cl.addLast(54);
        cl.addLast(11);
        cl.addLast(32);
       // cl.print();
       // cl.removeFirst();
     //  cl.removeLast();
        System.out.println();
        //cl.print();
        // cl.twoHalves();
        // System.out.println("first half:");
        // cl.print();

        // Node node[]=cl.splitTwoHalves();
        // cl.print(node[1]);
        // cl.exchangeFirstAndLast();
        // cl.print();
        System.out.println(cl.isCircularLinkedList());

        
        
    }
    
}
