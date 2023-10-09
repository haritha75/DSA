public class StackMain {

    public static void main(String[] args) {
        
        StackWithTwoQueues sQueues=new StackWithTwoQueues();
        sQueues.push(11);
        sQueues.push(54);
        sQueues.push(97);
        sQueues.push(43);
        sQueues.push(76);
        System.out.println(sQueues);
        sQueues.pop();
        System.out.println(sQueues);
        System.out.println(sQueues.peek());
        System.out.println(sQueues.pop());
        System.out.println(sQueues.peek());
        System.out.println(sQueues.isEmpty());
        System.out.println(sQueues.size());
        
    }
    
}
