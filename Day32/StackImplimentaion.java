import java.util.Arrays;
import java.util.EmptyStackException;

public class StackImplimentaion {

    private int items[];
    private int top=-1;

    StackImplimentaion() {
        this(5);
    }

    StackImplimentaion(int size) {
        items=new int[size];
    }

    public void push(int item) {
        if(isFull())
           throw new StackOverflowError();
        items[++top] = item;    


    }

    public boolean isFull() {

        return top==items.length-1;
    }

    public int pop() {
        if(isEmpty())
          throw new EmptyStackException();
        return items[top--];  
    }

    public boolean isEmpty() {
        return top==-1;
    }

    public int peek() {

        if(isEmpty()) 
          throw new EmptyStackException();
        return items[top];  
    }

    public int size() {
        return top+1;
    }

    @Override

    public String toString() {

        var x= Arrays.copyOfRange(items,0,top+1);
        return Arrays.toString(x);
    }

}