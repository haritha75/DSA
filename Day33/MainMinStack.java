public class MainMinStack {
    public static void main(String[] args) {
        
        MinStack minStack=new MinStack();
        minStack.push(33);
        System.out.println(minStack.min());
        minStack.push(11);
        System.out.println(minStack.min());
        minStack.push(22);
        System.out.println(minStack.min());
    }
    
}
