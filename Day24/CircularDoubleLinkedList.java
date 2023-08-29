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


    public void addLast(int value) {

        Node node=new Node(value);
        if(head==null) {
            head=node;
            head.next=head;
            head.previous=head.next;
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
         
    }
    public void addFirst(int value) {

        Node node=new Node(value);
        if(head==null) {
            head=node;
            head.next=head;
            head.previous=head.next;
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
    
}
