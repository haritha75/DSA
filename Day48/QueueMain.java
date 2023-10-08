public class QueueMain {

    public static void main(String[] args) {
        
        QueueWithLinkedList qList = new QueueWithLinkedList();
        qList.enqueue(11);
        qList.enqueue(44);
        qList.enqueue(98);
        qList.enqueue(12);
        qList.enqueue(54);
        System.out.println(qList);

        qList.dequeue();
        System.out.println(qList);
    }
    
}
