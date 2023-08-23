public class LinkedList {

    private class Node {

        private int value; //data value

        Node(int item) {
            this.value=item;
        }
        private Node next; //address of the node
    }

        private Node head;
        private Node tail;


    

    public void addLast(int item) {

        Node node=new Node(item);
        if(isEmpty()) { //here, we are checking head is null are not if null means there is no element so both tail and head pointing to the same node.
             head=tail=node;
        }
        else {
           tail.next=node; //whenever adding last node then that is the tail because we are adding at last then last node address storing to the previous tail and make.whenever node storing address that is not tail then make last node as a tail.
           tail=node;
        }     
        
    }
    private boolean isEmpty() {
        return head==null;
    }
    public void addFirst(int item) {
        Node node = new Node(item);

        if(isEmpty()) {
            head=tail=null;
        }

        else {
            node.next=head;
            head=node;  
        }  

    }


    public int valueOf(int index) {

        Node current = head; //here, we are checking form  head node.

        int start=0; //index

        while(current!=null) {
            if(start==index) 
               return current.value;
            current = current.next; //if condition false then we are updating that means we are going to the next node and checking and increasing index.
            start++;   
        }

        return -1;

    }

    public int getIndex(int value) {
         Node current=head;

         int start=0;

         while(current!=null) {
            if(current.value==value) 
              return start;
            current = current.next;
            start++;  
         }
         return -1;
    }

    public boolean contains(int value) {

        return getIndex(value)!=-1;
    }
}
