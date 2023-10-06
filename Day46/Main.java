public class Main {

    public static void main(String[] args) {
        
        QueueWithTwoStacks queue=new QueueWithTwoStacks();
        queue.enqueue(11);
        queue.enqueue(23);
        queue.enqueue(98);

        var de=queue.dequeue();
        System.out.println(de);
    }
    
}
