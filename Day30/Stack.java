import java.util.EmptyStackException;

public class Stack {

    private int items[];

    public Stack(int size) {

        items=new int[size];
    }

    private int top=-1;
    private int count=0;

    public void push(int value) {

        if(isFull())
          throw new RuntimeException("Stack is full");

        top++;
        items[top]=value;
        count++;  


    }

    public boolean isFull(){

        return count==items.length;
    }

    public boolean isEmpty() {

        return count==0;
    }

    public void pop() {

        if(isEmpty())
          throw new RuntimeException("Stack is empty");

        System.out.println(items[top]);
        top--;
        count--;
    }

    public void peek() {

        System.out.println(items[top]);
    }
    public void count() {
        
        System.out.println(count);
    }

    public void display() {

        for(int i=0;i<count;i++)
            System.out.print(items[i]+" ");
    }



}