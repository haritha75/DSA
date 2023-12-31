import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Stack;

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

    public void reverseKNodes(int k) {

        if(head==null)
          throw new IllegalStateException();

        if(head.next==null) {
            traverse(head);
            return;
        }


        Node previous=head;
        Node current=head.next;
        Node next=current.next;

        int count=1;

        while(count<k) {

            current.next=previous;
            previous=current;
            current=next;

            if(current==null)
             break;

           next=current.next;
           count++;  
        }

        head.next=current;
        head=previous;
        traverse(head);
             
    }

    public void reverseNodes(int k) {

        if(head==null ||k<=0 || k>size)
            throw new IllegalStateException();
         
        if(k==1)
          return;    

        int start=2;
        int v=start;
        
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
            }

            start++;
        }

    }

    public Node segregate(Node node) {

        Node evenStart,evenEnd,oddStart,oddEnd;
        evenStart=evenEnd=oddStart=oddEnd=null;

        for(Node current=head;current!=null;current=current.next) {

            var data=current.value;

            if(data%2==0) {

                if(evenStart==null)
                  evenStart=evenEnd=current;
                else{
                  evenEnd.next=current;
                  evenEnd=current; 
                } 
            }

            else {

                if(oddStart==null)
                   oddStart=oddEnd=current;
                else  {
                    oddEnd.next=current;
                    oddEnd=current;
                }

                     
            }       
        }

        if(evenStart==null || oddStart==null)
           return head;
        
        evenEnd.next=oddStart;
        oddEnd.next=null;
        return evenStart;   
    }

    public void LastNNodes(int n) {

        Node current= head;
        int beg=size;
        while(beg>n) {
            current=current.next;
            beg--;
        }
        head=current;
        return;

    }

    
    public void removeDup() {

        HashSet<Integer> set=new HashSet<>();

        Node current = head.next;
        Node previous=head;
        set.add(head.value);

        while(current!=null) {

            if(!set.contains(current.value)) {
               set.add(current.value);
                previous=current;
                current=current.next;
            }
            else {
                Node temp=current.next;
                current.next=null;
                previous.next=temp;
                current=previous.next;
                
            }
              
        }

    }
    public void removeDuplicates() {

        Node current=head;
        Node newCurrent=current;

        while(current!=null) {
            while(newCurrent.next!=null) {
                if(current.value!=newCurrent.next.value) {
                    newCurrent=newCurrent.next;
                }
                else {
                    Node temp=newCurrent.next.next;
                    newCurrent.next.next=null;
                    newCurrent.next=temp;

                }

            }
            current=current.next;
            newCurrent=current;
        }
    } 

    public void lastNNodes1(int n) {

        if(n>size || n<0)
           throw new IllegalArgumentException();
           Node first=head;
           Node second=head;

        if(n==0) {
            head=first;
            return;
        }
             
        for(int i=0;i<n;i++) {
            second=second.next;
        }
        if(second==null) {
             head=first;
             return;
        }

        while(second!=tail){
            first=first.next;
            second=second.next;
        }
        head=first.next;

    }
    public boolean isPalindrome() {

      if(isEmpty())
      throw new IllegalStateException();

    var first=head;
    var second=head;

    StringBuffer str=new StringBuffer();
    
    while(second!=tail&&second.next!=tail) {
        str.append(first.value);
        first=first.next;
        second=second.next.next;
    }
    StringBuffer str1=new StringBuffer();
     var current=first;
     if(second!=tail)
         str.append(first.value);

     current=first.next;
     
     while(current!=null) {
        str1.append(current.value);
        current=current.next;

     }
     str1.reverse();

     return str.compareTo(str1)==0;

   

    }
    // boolean palindrom()
    // {
    //     Node slow=head;
    //     Node fast=head;
    //     StringBuilder str=new StringBuilder();
    //     while(fast.next!=null && fast.next.next!=null)
    //     {
    //         str.append(slow.value);
    //         slow=slow.next;
    //         fast=fast.next.next;
    //     }
    //     StringBuilder str1=new StringBuilder();

    //     if(fast.next==null)
    //     {
    //         slow=slow.next;
    //         while(slow!=null)
    //         {
    //             str1.append(slow.value);
    //         }
    //     }
    //     else
    //     {
    //         while(slow!=null)
    //         {
    //             str1.append(slow.value);
    //         }
    //     }

    //     if(str==str1.reverse())
    //         return true;
    //     return false;

    // }

    public void intersectionPoint() {
       Node head1;
       Node head2;

       Node node=new Node(5);
       head1=node;
       Node node1=new Node(4);
       head2=node1;

       node =new Node(6);
       head1.next=node;

       node1=new Node(7);
       head2.next=node1;

       node1=new Node(8);
       head1.next.next=node1;
       head2.next.next=node1;
       
       node1 = new Node(9);
       head2.next.next.next=node1;
       while(head2!=null) {
        Node current=head1;

        while(current!=null) {
            if(head2==current) {
              System.out.println(head2.value);
              return;
            }
            current=current.next;

        }
          head2=head2.next;

       }
    
    }
    public void intersectionValue() {
       Node head1;
       Node head2;

       Node node=new Node(5);
       head1=node;
       Node node1=new Node(4);
       head2=node1;

       node =new Node(6);
       head1.next=node;

       node1=new Node(7);
       head2.next=node1;

       node1=new Node(8);
       head1.next.next=node1;
       head2.next.next=node1;
       
       node1 = new Node(9);
       head2.next.next.next=node1;

       HashSet<Node> set = new HashSet<>();

       while(head1!=null) {
           set.add(head1);
           head1=head1.next;
       }

       while(head2!=null) {

        if(!set.contains(head2)) {
            set.add(head2);
            head2=head2.next;

        }
        else {
            System.out.println(head2.value);
            return;
        }

       }

       }

       public boolean isPalindrome1() {

        String s="";
        var current=head;
        while(current!=null) {
            s +=current.value;
            current=current.next;
        }
        int j=s.length()-1;
        for(int i=0;i<s.length()/2;i++) {
            if(s.charAt(i)!=s.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
        
       }
      

       public void intersectionPoint1() {

       Node head1;
       Node head2;

       Node node=new Node(5);
       head1=node;
       Node node1=new Node(4);
       head2=node1;

       node =new Node(6);
       head1.next=node;

       node1=new Node(7);
       head2.next=node1;

       node1=new Node(11);
       head1.next.next=node1;
       head2.next.next=node1;
       
       node1 = new Node(9);
       head1.next.next.next=node1;

       Node first=head1;
       Node second=head2;

       int count=0,count1=0;
       while(first!=null||second!=null) {
        if(first!=null) {
            count++;
            first=first.next;

        }
        if(second!=null) {
            count1++;
            second=second.next;
        }
       }
       int different=count-count1;
       if(different>=0) {
        Node current=head1;
        for(int i=0;i<different;i++) {
            current=current.next;
        }
        Node current1=head2;
        while(current!=null) {
            if(current!=current1) {
                current=current.next;
                current1=current1.next;
            }
            else {
                System.out.println(current.value);
                return;
            }
        }
       }
       else {

        int diff=Math.abs(different);
        Node current=head2;
        for(int i=0;i<diff;i++) {
            current=current.next;

        }
        Node current1=head1;
        while(current!=null) {
            if(current!=current1) {
                current=current.next;
                current1=current1.next;
            }
            else {
                System.out.println(current.value);
                return;
            }
        }

       }

        
       }

        public boolean isPalindrome2() {
        int sum=0;
        Node current=head;

        while(current!=null) {

            sum =current.value+(sum*10);
            current=current.next;
        }
        
        int res=sum;
        int rev=0,rem;

        while(sum>0) {

            rem=sum%10;
            rev=(rev*10)+rem;
            sum=sum/10;
        }
         return res==rev;
       
        }
        public void reverseRecursion(Node head) {

            if(head==null)
              return;
            reverseRecursion(head.next);
            System.out.println(head.value);  

        } 

        public static LinkedList loopCreate() {
            var list=new LinkedList();
            list.addLast(2);
            list.addLast(5);
            list.addLast(9);
            var backUp=list.tail;

            list.addLast(7);
            list.addLast(15);
            list.addLast(54);
            list.tail.next=backUp;

            return list;

        }

        public int lengthOfLoop() {
            Node fast=head;
            Node slow=head;
            int count=1;
            while(fast!=null && fast.next!=null) {
                fast=fast.next.next;
                slow=slow.next;
            
                if(slow==fast) {
                    while(slow.next!=fast) {
                        count++;
                        slow=slow.next;
                    }
                return count;

                }
            }
            return 0;
        }

        public void removeLoop() {

            HashSet<Node> set=new HashSet<>();
            Node current=head;

            while(current.next!=null) {
                if(!set.contains(current.next)) {
                    set.add(current);
                    current=current.next;

                }else {
                    current.next=null;
                    return;
                }
            }

        }
       
    }
        
         
