public class DoubleLinkedList {
   private class Node {

    private int value;
    Node(int item) {
        this.value=item;
    }
    private Node previous;
    private Node next;

   }
    private Node head;
    private Node tail;
    private int size=0;

    public void addLast(int value) {

        Node node=new Node(value);

        if(isEmpty())
           head=tail=node;
         
        else {
            tail.next=node;
            node.previous=tail;
            tail=node;
            
        }    
        size++;
    }

     private boolean isEmpty() {
        return head==null;
    }

    public void addFirst(int value) {
       
        Node node=new Node(value);

        if(isEmpty())
           head=tail=node;
        
        else {
            
            head.previous=node;
            node.next=head;
            head=node;

        }   
       size++;
    }

    public void printValues() {

        Node current=head;
        while(current!=null) {
            System.out.println(current.value);
            current=current.next;
        }
    }

    public void printReverse() {

        Node reverse=tail;

        while(reverse!=null) {
            System.out.println(reverse.value);
            reverse=reverse.previous;

        }

    }
}