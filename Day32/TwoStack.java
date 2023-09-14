import java.util.Arrays;
import java.util.EmptyStackException;

public class TwoStack {

    private int items[];

     TwoStack(){

        this(5);
     }

    TwoStack(int size) {

        items=new int[size];
        top2 = items.length;
    }

    private int top1=-1,top2;

    public void push1(int item) {

        if(isFull1())
          throw new StackOverflowError();
        items[++top1]=item;

    }
    public void push2(int item){

        if(isFull2())
          throw new StackOverflowError();
        items[--top2]=item;

    }

    private boolean isFull1() {
        return top1+1==top2;

    }
    private boolean isFull2(){
        return top2-1==top1;
    }

    public int pop1() {
        if(isEmpty1())
          throw new EmptyStackException();
        return items[top1--];


    }
    public int pop2() {

        if(isEmpty2())
         throw new EmptyStackException();
        return items[top2++];

    }

    private boolean isEmpty1() {

        return top1==-1;
    }
    private boolean isEmpty2() {

        return top2==items.length;
    }
    public void peek1() {

        if(isEmpty1())
          throw new EmptyStackException();
        System.out.println(items[top1]);
    }

    public void peek2() {

        if(isEmpty2())
          throw new EmptyStackException();
        System.out.println(items[top2]);
    }
    public void size() {

        System.out.println(items.length-top2+top1+1);
    }

     @Override

    public String toString() {

        var x= Arrays.copyOfRange(items,0,items.length);
        return Arrays.toString(x);
    }

    public void print1() {
        for(int i=0;i<top1+1;i++)
            System.out.print(items[i]+" ");
    }

    public void print2() {
        for(int i=items.length-1;i>=top2;i--)
            System.out.print(items[i]+" ");

    }

    
}
