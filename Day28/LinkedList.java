import java.util.HashSet;
import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {

        private int value; //data value
        Node() {

        }

        Node(int item) {
            this.value=item;
        }
        private Node next; //address of the node
    }

        Node head;
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
public void lastIndexOf(int value) {
    Node current=head;
    int start=0;
    int ind=-1;
    while(current!=null) {

        if(current.value==value) {

            ind=start;
        }
        start++;
        current=current.next;

    }
    System.out.println(ind);
}
public void addAt(int value,int index) {
   
    if(index<0 || index>size())
       throw new IllegalArgumentException();


        if(index==0) {
            addFirst(value);
            size++;
            return;
        }
        if(index==size()) {
            addLast(value);
            size++;
            return;
        }
    
        Node node=new Node(value);
        Node current=head;

        int start=0;
    
            if(start<index-1) {
                current=current.next;
                start++;
            
            }
            node.next=current.next;
            current.next=node;
            size++;
            
        }
        public void printValues() {

            Node current=head;
            while(current!=null) {
                System.out.println(current.value);
                current=current.next;
            }
        }
    public void BinaryToDecimal() {

        int res=0;
        Node current=head;
        while(current!=null) {
            res *=2;
            res +=current.value;
            current=current.next;
        }
    }

    public int BinaryToDec() {

        int val=size()-1;
        int res=0;
        Node current=head;
        while(current!=null) {
            int sum=(int) Math.pow(2, val);
            sum *=current.value;
            res +=sum;
            current=current.next;
            val--;
        }
        return res;
    }

    public int BinarytoDec1() {
        reverse();
        int val=0;
        int res=0;
        Node current=head;
        while(current!=null) {
            int sum=(int) Math.pow(2, val);
            sum *=current.value;
            res +=sum;
            current=current.next;
            val++;
        }
        return res;
       
    }

    public void traverse(Node node) {

        if(node==null) 
            return;

        System.out.println(node.value);
        traverse(node.next);  
    }

    public void insertLastRecursion(Node node,int value) {

        if(node==null) {
           head=new Node(value);
           return;
        }

        else if(node.next==null) {
            node.next=new Node(value);
            return;

        }
        insertLastRecursion(node.next, value);


    }

    public void removeLastRec(Node node) {
        if(node==null)
           throw new IllegalStateException();
        else if(node.next==null) {
            head=null;
            return;
        }   

        else if(node.next.next==null) {
            node.next=null;
            return;
        }

        removeLastRec(node.next);
    }

    public void insertAtRight(int value) {

        Node node=new Node(value);

        if(head==null) 
           head=node;
        else if(node.value<head.value) {

            node.next=head;
            head=node;
        }   
        else {
            Node cur=head;

            while(cur.next!=null && cur.next.value<node.value) {
                cur=cur.next;
            }
            node.next=cur.next;
            cur.next=node;
        }

    }

    public LinkedList joinTwoList(LinkedList l1,LinkedList l2) {

        if(l1.head==null) {
            l1.head=l2.head;

            return l1;
            
        }

        if(l2.head==null) {
            return l1;
        }
        else {

            Node current=l1.head;

            while(current.next!=null) {
                current=current.next;
            }
            current.next=l2.head;
            return l1;
        }
    }

    public LinkedList joinTwoList1(LinkedList l1,LinkedList l2,Node node) {

        if(l1.head==null) {
            l1.head=l2.head;

            return l1;
            
        }

        if(l2.head==null) {
            return l1;
        }
         else if(node.next==null){

                node.next=l2.head;
                return l1;

         }

        joinTwoList1(l1, l2,node.next);
        return l1;



    }
     public void keyReverse(int k) {

        if(head==null)
          return;
        if(k>size || k<=0)
           throw new IllegalStateException();
        if(k==1)
           return;
           
        int start=2;   

         Node previous=head;
         Node current=head.next;

         while(current!=null) {
           Node next=current.next;
           current.next=previous;
           previous=current;
           current=next;
           if(k==start) {

            head.next=current;
            head=previous;
            return;
           }

           start++;
       }
         
    }
        
    }       



