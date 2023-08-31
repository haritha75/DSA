public class Main {
    public static void main(String[] args) {
        CircularLinkedList cl=new CircularLinkedList();

         //cl.addLast(99);
         cl.addFirstOptimized(20);
        //  cl.addLastOPtimized(23);
        // cl.addLast(23);
        // cl.addFirst(11);
        // cl.addLastOPtimized(11);
        // cl.addFirst(54);
        // cl.addLast(12);
       // cl.print();
       //cl.removeFirst();
       //cl.removeLast();
       cl.removeFirstOptimized();
       System.out.println();
       System.out.println(cl.IndexOf(23));
       System.out.println(cl.lastIndexOf(11));
      //cl.rightSlot(5);
    //   cl.rightSlot(8);
    //   cl.rightSlot(75);
    //   cl.rightSlot(33);

      



        cl.print();
    }
    
}
