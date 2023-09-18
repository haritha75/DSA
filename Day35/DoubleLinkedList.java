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

    public void addManyAtLast(int arr[]) {
        for(var x:arr)
          addLast(x);
    }

    public void addManyAtFirst(int arr[]) {
        for(var x:arr)
          addFirst(x);
    }

    public void addAt(int index,int value) {
        if(index<0 || index>size) 
           throw new IllegalArgumentException();
        if(index==0) {
            addFirst(value);
            size++;
            return;

        }
        else if(index==size) {
            addLast(value);
            size++;
            return;

        }
        
            Node node = new Node(value);
            int start=0;
            Node current=head;
            while(start<index-1) {
                current=current.next;
                start++;
            }

            current.next.previous=node;
            node.next=current.next;
            current.next=node;
            node.previous=current;
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

    public void removeFirst() {

        if(isEmpty()) 
          throw new IllegalStateException();

        if(head==tail)
           head=tail=null;

        else {
            Node temp=head.next;
            head.next=null;
            head=temp;
            head.previous=null;
        }    
        size--; 
    }

    public void removeLast() {

        if(isEmpty()) 
          throw new IllegalStateException();

        if(head==tail)
           head=tail=null;

        else {
            Node temp=tail.previous;
            tail.previous=null;
            tail=temp;
            tail.next=null;

        }
        size--;
    }

    public int indexOf(int value) {

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
    public void lastIndexOf(int value) {

        Node current=tail;
        int start=size()-1;
        while(current!=null) {
            if(current.value==value)   
               System.out.println(start);
            current=current.previous;
            start--;   
               
        }
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
    public void reverse() {
        if(isEmpty())
          return;

       Node previous1=head;
       Node current=head.next;

       while(current!=null) {
        Node next=current.next;
        current.next=previous1;
        previous1=current;
        current=next;

       }   
       tail=head;
       tail.next=null;
       head=previous1;
       head.previous=null;
    }
    public int size() {
        return size;
    }

    public boolean isPalindrome() {

        Node current=head;
        Node last=tail;

       while(current!=last &&current.previous!=last ) {
        
        if(current.value!=last.value) 
            return false;
        
        current=current.next;
        last=last.previous;

          
       }
       return true;
    }
}