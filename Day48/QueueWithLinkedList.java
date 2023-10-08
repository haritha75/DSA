import java.util.ArrayList;

public class QueueWithLinkedList {

    private class Node {

        private int data;
        private Node next;

        Node(int data) {
            this.data=data;
        }

    }
    private Node head;
    private Node tail;
    private int count;

    public void enqueue(int item) {

        Node node=new Node(item);

        if(isEmpty()) 
          head=tail=node;

        else  {
           tail.next=node;
           tail=node; 
        }

        count++;  
    }

    public int dequeue() {

        if(isEmpty())
          throw new IllegalStateException();

        int data=head.data;
        
        if(head==tail)
          head=tail=null;

        else {

            var temp=head.next;
            head.next=null;
            head=temp;
        }  
          count--;
          return data;
    }

    public int peek() {

        if(isEmpty())
           throw new IllegalStateException();

        return head.data;
    }

    public boolean isEmpty() {
        return head==null;
    }

    public int size() {

        return count;
    }
    public String toString() {

        ArrayList<Integer> list=new ArrayList<>();

        var current=head;
        while(current!=null) {
            list.add(current.data);
            current=current.next;

        }

        return list.toString();
    }
    
}
