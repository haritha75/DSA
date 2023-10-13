public class Main {

    public static void main(String[] args) {
        DequeImplimentaion deque=new DequeImplimentaion();
        deque.offerLast(12);
        deque.offerFirst((91));
        deque.offerFirst(11);
        deque.offerFirst(43);
        deque.offerFirst(65);

        deque.print();

        deque.pollLast();
        deque.pollFirst();
        deque.print();



    }
    
}
