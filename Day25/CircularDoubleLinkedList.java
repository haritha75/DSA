public class CircularDoubleLinkedList {

    private class Node {
        private int value;

        Node(int item) {
            this.value=item;
        }
        private Node next;
        private Node previous;

    }
    
    private Node head;
    private int size=0;


    public void addLast(int value) {

        Node node=new Node(value);
        if(head==null) {
            head=node;
            head.next=head;
            head.previous=node;
        }
        else {
            Node current=head;
            while(current.next!=head) {
                current=current.next;
            }
            current.next=node;
            node.previous=current;
            node.next=head;
            head.previous=node;
        }
        size++;
         
    }
    public void addLastOPtimized(int value) {

        Node node=new Node(value);

        if(head==null) {
            head=node;
            head.next=head;
            head.previous=node;
        }

        else {

            node.next=head.next;
            head.next=node;
            head.previous=head;
            head.next=node;
            int temp=node.value;
            node.value=head.value;
            head.value=temp;
            head=node;

        }
        size++;

    }


    public void addFirst(int value) {

        Node node=new Node(value);
        if(head==null) {
            head=node;
            head.next=head;
            head.previous=node;
        }

        else {
            Node current=head;
            while(current.next!=head) {
                current=current.next;
            }
            current.next=node;
            node.previous=current;
            node.next=head;
            head.previous=node;
            head=node;
        }
        size++;
    }

    public void addFirstOptimized(int value) {
        Node node=new Node(value);

        if(head==null) {
            head=node;
            head.next=head;
            head.previous=node;
        }
        else {

            int temp=head.value;
            head.value=node.value;
            node.value=temp;
            Node temp1=head.next;
            node.next=temp1;
            head.next.previous=node;
            node.previous=head;
            head.next=node;


        }
        size++;


    }

    public void print() {

        if(head==null)
          throw new IllegalStateException();
        else {
            Node current=head.next;
            System.out.println(head.value);
            while(current!=head) {
                System.out.println(current.value);
                current=current.next;
            }
        }  
    }
    public int size() {
        return size;

    }
    
}
