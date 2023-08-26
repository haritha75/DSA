import java.util.HashSet;
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
      throw new IllegalStateException();

    var first=head;
    var second=head;
    
    while(second!=tail&&second.next!=tail) {
        first=first.next;
        second=second.next.next;
    }

    if(second==tail) 
       System.out.println(first.value);
    else 
       System.out.println(first.value+" "+first.next.value);   
     

   
   }
   public void kthNodeFormLast(int k) {

    if(isEmpty())
       throw new IllegalStateException();

       var first = head;
       var second = head;

       for(int i=0;i<k;i++) {
         second=second.next;
         if(second==null)
           throw new IllegalStateException();
       }
       
       while(second!=tail){
          first=first.next;
          second=second.next;
       }
       System.out.println(first.next.value); 

   }
  
static LinkedList createLoop() {
    var list=new LinkedList();
    list.addLast(30);
    list.addFirst(22);
    list.addLast(76);
    list.addLast(65);

    var backUp=list.tail;

    list.addLast(87);
    list.addLast(54);
    list.tail.next=backUp;

    return list;

}

boolean detectLoop() {

    var slow=head;
    var fast=head;
    while(fast!=null&&fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;

        if(slow==fast)
           return true;
    }
    return false;
}
boolean detectLoop1(){

    HashSet<Object> set=new HashSet<>();
    var cur=head;

    while(cur.next!=null) {
        if(!set.contains(cur)) {
            set.add(cur);
            cur=cur.next;
        }
        else{
            return true;
        }
    }
    return false;
}

    
}
