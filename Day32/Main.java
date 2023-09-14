public class Main {

    public static void main(String[] args) {
        StackImplimentaion stack = new StackImplimentaion(4);

        stack.push(9);
        stack.push(8);
        stack.push(3);
        stack.push(22);
        System.out.println(stack);
        System.out.println(stack.isFull());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
    
}
