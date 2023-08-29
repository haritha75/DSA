import java.util.NoSuchElementException;

public class CircularLinkedList {

    private class Node {
        private int value;
        Node(int item) {
            this.value=item;

        }
        private Node next;
    }
    private Node head;

    public void addLast(int value) {
        Node node=new Node(value);
        if(head==null) {
           head=node;
           head.next=head;
        }
        else {

            Node current=head.next;
            while(current.next!=head) {
               
                current=current.next;
            }
            current.next=node;
            node.next=head;

        }
    }

    public void addFirst(int value) {

        Node node=new Node(value);
        if(head==null) {
           head=node;
           head.next=head;
        }
        else {

            Node current=head.next;
            System.out.println();
            while(current.next!=head) {
               
                current=current.next;
            }
            current.next=node;
            node.next=head;
            head=node;

        }
    }
    public void removeFirst() {
        if(head==null)
            throw new NoSuchElementException();
        if(head==head.next)   
            head=null; 
        else {
            Node temp=head.next;
            Node cur=temp;
            while(cur!=head&&cur.next!=head) {
                cur=cur.next;
            }
            head.next=null;
            head=temp;
            cur.next=head;


        }    
    }
    public void removeLast() {
        if(head==null)
            throw new NoSuchElementException();
        if(head==head.next)   
            head=null; 

        else {
            Node temp=head;
            Node cur=head.next;
            while(cur!=head&&cur.next.next!=head) {
                cur=cur.next;
            }
            cur.next=head;
        }    

    }

    public void print() {
        if(head==null)
           throw new IllegalStateException();
        else {
            System.out.println(head.value);

            Node current=head.next;
            while(current!=head) {
                System.out.println(current.value);
                current=current.next;

            }
        }
             
    }

}