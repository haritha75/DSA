import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Stack1 {


     private class Node {

        private int value; 
        Node() {

        }

        Node(int item) {
            this.value=item;
        }
        private Node next; 
    }

        Node top;
        private Node tail;
        private int size=0;


    public void push(int item) {

        addFirst(item);

    }    

    boolean isEmpty() {
        return top==null;
    }
    public void addFirst(int item) {
        Node node = new Node(item);

        if(isEmpty()) {
            top=node;
        }

        else {
            node.next=top;
            top=node;  
        }  
      size++;
    }

    public void pop() {
         removeFirst();
    }
     public void removeFirst() {

        if(isEmpty())
          throw new NoSuchElementException();

        if(top.next==null) {
            System.out.println(top.value);
           top=null;
        }

        else {
            System.out.println(top.value);
            Node temp=top.next;
            top.next=null;
            top=temp;
        }     

        size--;
    }

    public int peek() {

        if(isEmpty())
           throw new EmptyStackException();
        return top.value;   

    }
    public int size() {
        return size;
    }
    
}
