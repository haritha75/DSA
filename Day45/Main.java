public class Main {
    public static void main(String[] args) {
        ArrayDeque arrayDeque=new ArrayDeque(4);

        arrayDeque.enqueue(30);
        arrayDeque.enqueue(15);
        arrayDeque.enqueue(55);
        arrayDeque.enqueue(22);

        arrayDeque.dequeue();
        arrayDeque.dequeue();
        arrayDeque.enqueue(76);
        arrayDeque.enqueue(11);
        System.out.println(arrayDeque);
    }
    
}
