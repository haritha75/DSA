public class Stack1Main {

    public static void main(String[] args) {

            Stack1 stack1=new Stack1();

            stack1.push(11);
            stack1.push(54);
            stack1.push(99);

            System.out.println(stack1.pop());
            System.out.println(stack1.peek());
            System.out.println(stack1.value(12));
            System.out.println(stack1.findValue(11));
            stack1.index(54);

        
    }

    
    
}
