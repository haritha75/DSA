public class Main1 {

    public static void main(String[] args) {
        CircularDoubleLinkedList dl=new CircularDoubleLinkedList();
        // dl.addLast(33);
        // dl.addLast(21);
        // dl.addFirst(97);
        // dl.addFirst(85);
        dl.addFirstOptimized(22);
        dl.addFirstOptimized(12);
        dl.addFirstOptimized(54);
        dl.addLastOPtimized(35);
        dl.print();
    }
    
}
