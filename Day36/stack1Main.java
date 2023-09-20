public class stack1Main {

    public static void main(String[] args) {
        
        Stack1 stack1 = new Stack1(5);
        // stack1.push(12);
        // stack1.push(45);
        // stack1.push(66);
        // stack1.push(98);
        // stack1.pop();
        // System.out.println(stack1.peek());
        // stack1.pop();
        // stack1.pop();
        // System.out.println(stack1.isEmpty());
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(2);
        stack1.push(1);
       // System.out.println(stack1.isPalindrome());
        System.out.println(stack1.isPalindrome2());


    }
    
}
