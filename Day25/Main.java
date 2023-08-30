public class Main {
    public static void main(String[] args) {
        CircularLinkedList cl=new CircularLinkedList();

        cl.addLast(99);
        cl.addLast(23);
        cl.addFirst(11);
        cl.addFirst(54);
        cl.addLast(11);
        cl.print();
       // cl.removeFirst();
       cl.removeLast();
        System.out.println();
        cl.print();
    }
    
}
