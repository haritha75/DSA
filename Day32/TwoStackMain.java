public class TwoStackMain {

    public static void main(String[] args) {
        
        TwoStack twoStack = new TwoStack(6);

        twoStack.push1(3);
        twoStack.push1(11);
        twoStack.push2(66);
        twoStack.push2(12);
        System.out.println(twoStack.toString());
        twoStack.size();

        System.out.println(twoStack.pop1());
        System.out.println(twoStack.pop2());
        System.out.println();
        twoStack.peek1();
        twoStack.peek2();

        twoStack.print1();
        System.out.println();
        twoStack.print2();


    }
    
}
