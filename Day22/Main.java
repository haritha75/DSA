public class Main {

    public static void main(String[] args) {
        
        DoubleLinkedList dl=new DoubleLinkedList();
        dl.addLast(22);
        dl.addLast(43);
        dl.addFirst(33);
        dl.addFirst(87);
        dl.printValues();
        dl.printReverse();
    }
    
}
