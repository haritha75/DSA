public class stack1Main {

    public static void main(String[] args) {
        
        Stack1 stack1 = new Stack1();
        stack1.push(12);
        stack1.push(45);
        stack1.push(66);
        stack1.push(98);
        stack1.pop();
        System.out.println(stack1.peek());
        stack1.pop();
        stack1.pop();
        System.out.println(stack1.isEmpty());


    }
    
}
