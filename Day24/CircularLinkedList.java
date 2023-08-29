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