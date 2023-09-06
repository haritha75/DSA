public class DoubleLinkedList {
    //Node headnext;
    //Node headup;
    Node head;

    class Node {

        int value;
        Node next;
        Node up;

         Node(int value) {
            this.value=value;
         }
    }

    void addNext(int value) {
        Node node=new Node(value);

        if(head.next==null) {
            head.next=node;
        }

        else {
            Node cur =head.next;

            while(cur.next!=null) {
                cur=cur.next;
            }
            cur.next=node;
        }
    }

    void addUp(int value) {
        Node node=new Node(value);

        if(head.up==null) {
            head.up=node;
        }

        else {
            Node cur=head.up;

            while(cur.up!=null) {
                cur=cur.up;
            }
            cur.up=node;
        }
    }

    public void traverse(Node node) {

        if(node==null) 
            return;

        System.out.println(node.value);
        traverse(node.next);  
    }

    
}
