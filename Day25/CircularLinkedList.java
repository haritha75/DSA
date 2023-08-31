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
    public void addLastOPtimized(int value) {

        Node node=new Node(value);

        if(head==null) {
           head=node;
           head.next=head;
        }
        else {

            node.next=head.next;
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
    public void addFirstOptimized(int value) {

         Node node=new Node(value);

        if(head==null) {
           head=node;
           head.next=head;
        }
        else {
            int temp=head.value;
            head.value=node.value;
            node.value=temp;
            Node backup=head.next;
            head.next=node;
            node.next=backup;
        }
        size++;

    }

    public void addAt(int index, int value) {

        if(index < 0 || index > size)
            throw new IllegalArgumentException();

        if(index == 0) {
            addFirstOptimized(value);
            return;
        }
        if(index==size) {
            addLastOPtimized(value);
        } else {
            var node = new Node(value);
            int start = 0;
            var current = head;
            while (start<index-1) {
                current = current.next;
                start++;
            }
            var temp = current.next;
            current.next = node;
            node.next = temp;
            size++;
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
        size--;
    }

    public void removeFirstOptimized() {

         if(head==null)
            throw new NoSuchElementException();
        if(head==head.next)   
            head=null; 
        
        else {
            Node temp=head.next.next;
            head.value=head.next.value;
            head.next.next=null;
            head.next=temp;

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
            cur.next.next=null;
            cur.next=head;
        }    

        size--;

    }

    public void removeAt(int index) {

        if(index < 0 || index >= size)
            throw new IllegalArgumentException();

        if(index == 0) {
            removeFirstOptimized();
            return;
        }
        if(index == size()-1) {
            removeLast();
            return;
        }
        var current = head;
        int start = 0;
        while (start < index-1) {
            current = current.next;
            start++;
        }
        var temp = current.next.next;
        current.next.next = null;
        current.next = temp;
        size--;
    }
    
    public int IndexOf(int value) {
        if(head.value==value)
          return 0;
        Node current=head.next;

        int start=1;

        while(current!=head) {
           if(current.value==value) 
             return start;
           current = current.next;
           start++;  
        }
        return -1;
   }
   public int lastIndexOf(int value) {
    Node current=head.next;
    int start=1;
    int ind=-1;

    if(head.value==value)
       ind=0;
       
    while(current!=head) {

        if(current.value==value) {

            ind=start;
        }
        start++;
        current=current.next;

    }
    return ind;
    
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
    public int size() {
        return size;
    }

    public void rightSlot(int value) {
        Node node=new Node(value);

        if(head==null) {
          head=node;
          node.next=node;
        }
        else if(head==head.next) {
            if(head.value>node.value) 
               addFirstOptimized(value);
            else 
                addLastOPtimized(value);  
          size++;       
        }
        else {
            if(value<head.value)
               addFirstOptimized(value);
               else {

                Node cur=head;
                int index=1;

                while(cur.next!=head) {
                    if(cur.value<node.value && cur.next.value>node.value) {
                        addAt(index, value);
                        return;
                    }
                    cur=cur.next;
                    index++;
                }
                if(value>cur.value)
                 addLastOPtimized(value);
               }
            


        }

    }
    public void delRepeatNode() {
        Node cur=head.next;

        if(head.value==head.next.value)
            removeFirst();
        while(cur.next!=head) {
        if(cur.value==cur.next.value) {
            Node temp=cur.next.next;
            cur.value=cur.next.value;
            cur.next.next=null;

            cur.next=temp;
        }
        
        cur=cur.next;

    }
}
}

 