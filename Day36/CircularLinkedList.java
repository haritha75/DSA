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
    private int size=0;

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
     size++;
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
        size++;
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
        size--;   
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
     size--;
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
    public void twoHalves() {
        Node head1;
        Node head2=null;

        head1=head;
        if(size%2==0) {
            for(int i=0;i<size/2-1;i++) {
                head1=head1.next;
            }
           twoHalvesHelp(head1,head2);
           

        }
        else {

            for(int i=0;i<size/2;i++) {
                head1=head1.next;
            }
           twoHalvesHelp(head1,head2);
        }
        
    }
    private void twoHalvesHelp(Node head1,Node head2) {
        

            Node temp=head1.next;
            head1.next=null;
            head1.next=head;
            head2=temp;
            Node current=head2;

            while(current.next!=head) {
                current=current.next;
            }
            current.next=null;
            current.next=head2;
            System.out.println("Second half:");
            System.out.println(head2.value);
            Node cur=head2.next;

            while(cur!=head2) {
                System.out.println(cur.value);
                cur=cur.next;
            }

    }

}