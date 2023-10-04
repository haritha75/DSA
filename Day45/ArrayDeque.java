import java.util.Arrays;

public class ArrayDeque {
    int items[];
    int count;

    ArrayDeque(int size) {
        items=new int[size];

    }

    int front;
    int rear;

    void enqueue(int item) {

        if(isFull()) 
          throw new IllegalStateException();

       items[rear]=item;
       rear=(rear+1)%items.length;
       count++;   
    }
    int dequeue() {

        if(isEmpty()) 
          throw new IllegalStateException();

       var firstValue=items[front];
       items[front]=0;
       front=(front+1)%items.length;
       count--;   

       return firstValue;
    }

    boolean isFull() {
        return count==items.length;
    }
    boolean isEmpty() {
        return count==0;
    }
    int size() {
        return count;

    }

    int peek() {
        if(count==0)
          throw new IllegalStateException();

        return items[front];  
    }
    @Override
    public String toString() {
       return Arrays.toString(items);
    }
    
}