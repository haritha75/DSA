import java.util.Arrays;
import java.util.EmptyStackException;

public class GenericStack<T> {

     private Object items[];
    private int top=-1;

    GenericStack() {
        this(5);
    }

    GenericStack(int size) {
        items=new Object[size];
    }

    public void push(int item) {
        if(isFull())
           throw new StackOverflowError();
        items[++top] = item;    


    }

    public boolean isFull() {

        return top==items.length-1;
    }

    public Object pop() {
        if(isEmpty())
          throw new EmptyStackException();
        return items[top--];  
    }

    public boolean isEmpty() {
        return top==-1;
    }

    public Object peek() {

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
    

