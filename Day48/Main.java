public class Main {

    public static void main(String[] args) {
        
        PriorityQueueWithArray pqWithArray = new PriorityQueueWithArray();

        pqWithArray.enqueue(11);
        pqWithArray.enqueue(34);
        pqWithArray.enqueue(3);
        pqWithArray.enqueue(1);
        pqWithArray.enqueue(2);
        System.out.println(pqWithArray);

        var first=pqWithArray.dequeue();
        System.out.println(first);
        System.out.println(pqWithArray);

        pqWithArray.enqueue(22);

        System.out.println(pqWithArray);
        System.out.println(pqWithArray.peek());
        pqWithArray.dequeue();
        System.out.println(pqWithArray.peek());



        
    }
    
}
