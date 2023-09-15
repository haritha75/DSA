public class MainMaxStack {
    public static void main(String[] args) {
        
        MaxStack maxStack=new MaxStack();
        maxStack.push(33);
        System.out.println(maxStack.max());
        maxStack.push(41);
        System.out.println(maxStack.max());
        maxStack.push(22);
        System.out.println(maxStack.max());
    }
}
