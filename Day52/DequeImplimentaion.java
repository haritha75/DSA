public class DequeImplimentaion {

    private class Node {
        Node previous;
        int data;
        Node next;
        Node (int data) {
            this.data=data;
        }

    }

    Node front;
    Node rear;
    int count;

    public void offerFirst(int data) {

        Node node=new Node(data);

        if(isEmpty())
          front=rear=node;

        else {
            front.previous=node;
            node.next=front;
            front=node;
        }  
        count++;
    }

    public void offerLast(int data) {

        Node node = new Node(data);

        if(isEmpty()) 
           front=rear=node;
        else {

            rear.next=node;
            node.previous=rear;
            rear=node;

        }   
        count++;
    }

    public boolean isEmpty() {
        return front==null;
    }

    public int pollFirst() {

        if(isEmpty()) 
           throw new IllegalStateException();
        if(front==rear) {

            int value=front.data;
            front=rear=null;
            count--;
            return value;
        }
        else {

            int value=front.data;
            Node second=front.next;
            front.next=null;
            front=second;
            front.previous=null;
            count--;

            return value;

        }
              

    }

    public int pollLast() {

        if(isEmpty()) 
           throw new IllegalStateException();
        if(front==rear) {

            int value=front.data;
            front=rear=null;
            count--;
            return value;
        }
        else {

            int value=rear.data;
            Node last=rear.previous;
            rear.previous=null;
            rear=last;
            rear.next=null;
            count--;

            return value;

        }
              

    }

    public int peekFirst() {
        if(isEmpty())
            throw new IllegalStateException();
        else
            return front.data;
    }

    public int peekLast() {
        if(isEmpty())
            throw new IllegalStateException();
        else
            return rear.data;
    }

    public void print() {
        var current = front;
        while (current != null) {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }

    public int size() {

        return count;
    }

}