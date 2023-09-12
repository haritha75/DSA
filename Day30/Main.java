public class Main {

    public static void main(String[] args) {
        
        Stack stack=new Stack(5);
        stack.push(4);
        stack.push(12);
        stack.push(11);
        stack.push(45);
        stack.push(99);
        stack.display();
        System.out.println();
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        stack.pop();
        stack.display();
        System.out.println();
        stack.peek();
        stack.count();
    }
    
}
