import java.util.NoSuchElementException;

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
        private int size=0;

    

    public void addLast(int item) {

        Node node=new Node(item);
        if(isEmpty()) { 
             head=tail=node;
        }
        else {
           tail.next=node; 
           tail=node;
        }     
        size++;
        
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
      size++;
    }


    public int valueOf(int index) {

        Node current = head; 

        int start=0; 

        while(current!=null) {
            if(start==index) 
               return current.value;
            current = current.next; 
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
    public void removeFirst() {

        if(isEmpty())
          throw new NoSuchElementException();

        if(head==tail)
           head=tail=null;

        else {
            Node temp=head.next;
            head.next=null;
            head=temp;
        }     

        size--;
    }
    public void removeLast() {

        if(isEmpty())
           throw new NoSuchElementException();

        if(head==tail)
          head=tail=null;

        else {
            Node current = head;

            while(current.next!=tail)
              current = current.next;
            
            current.next=null;
            tail=current;  

        }     

        size--;
    }

   public int size() {
    return this.size;
   }

   public void reverse() {

    if(isEmpty())
       return;
    
       Node previous=head;
       Node current=head.next;

       while(current!=null) {
          Node next=current.next;
          current.next=previous;
          previous=current;
          current=next;
       }

       tail=head;
       tail.next=null;
       head=previous;
   }
   public void middleNode() {

    if(isEmpty())
       throw new NoSuchElementException();
    if(size()==1)
        System.out.println(head.value);
    else {

        Node current = head;
        int start=0;
        while(current!=null) {
            
           if(start==size()/2)
               System.out.println(current.value);
            current=current.next;
            start++;  
        }
    }        
   }
   public void kthNodeFormLast(int k) {
       if(k<0 || k>size())
           throw new IllegalArgumentException();

        else{
            Node current = head;
            int  start=0;

            while(current!=null) {
                if(start==(size()-k))
                     System.out.println(current.value);
                current=current.next;
                start++;     
                   

            }
        }   

   }
   public void previousNode(int value) {
    if(isEmpty())
         throw new NoSuchElementException();
    if(head==tail)
      return;    

    else{
       
      Node current=head.next;
      int previous=head.value;
      boolean flag=false;

      while(current!=null) {
        if(current.value==value) {
           flag=true;
           System.out.println(previous);
        }
        previous=current.value;   
        current=current.next;         
            
      }
      if(flag==false)
         System.out.println(-1);

    }
   }

   public int nextNode(int value) {

    if(isEmpty())
      throw new NoSuchElementException();
    if(size()==1)
       throw new NoSuchElementException();

    else {
        if(getIndex(value)==-1) 
            throw new NoSuchElementException("entering value is not in the list");
        if(value==tail.value)
           throw new NoSuchElementException("next node is not available because entering value is tail node value");
              
       else {
        Node current=head;
        int nextValue=head.next.value;
        while(current!=tail) {

            if(current.value==value) {
                  return nextValue;
            }
            
            current=current.next;
            nextValue=current.next.value;           
        }
              
    }     
    
   }
   return 0;
}
    
}
