import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Stack;

public class Stack1 {


     private class Node {

        private int value; 
        Node() {

        }

        Node(int item) {
            this.value=item;
        }
        private Node next; 
    }

        Node top;
        private Node tail;
        private int size=0;


    public void push(int item) {

        addFirst(item);

    }    

    boolean isEmpty() {
        return top==null;
    }
    public void addFirst(int item) {
        Node node = new Node(item);

        if(isEmpty()) {
            top=node;
        }

        else {
            node.next=top;
            top=node;  
        }  
      size++;
    }

    public void pop() {
         removeFirst();
    }
     public void removeFirst() {

        if(isEmpty())
          throw new NoSuchElementException();

        if(top.next==null) {
            System.out.println(top.value);
           top=null;
        }

        else {
            System.out.println(top.value);
            Node temp=top.next;
            top.next=null;
            top=temp;
        }     

        size--;
    }

    public int peek() {

        if(isEmpty())
           throw new EmptyStackException();
        return top.value;   

    }
    public int size() {
        return size;
    }

    public boolean isPalindrome() {

        Node current=top;
        StringBuffer str=new StringBuffer();
        while(current!=null) {
            str.append(current.value);
            current=current.next;

        }
        int j=str.length()-1;

        for(int i=0;i<str.length()/2;i++) {
            if(str.charAt(i)!=str.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }
    public boolean isPalindrome1() {

        Node current = top;
        int sum=0;

        while(current!=null) {
            sum =current.value+sum*10;
            current=current.next;
        }
        int res=sum,rem,rev=0;

        while(sum>0) {

            rem=sum%10;
            rev=(rev*10)+rem;
            sum =sum/10;

        }
        return rev==res;

    }
    public boolean isPalindrome2() {

        if(isEmpty())
          throw new IllegalStateException();

        Stack<Integer> sta = new Stack();

        Node current = top;
        for (int i = 0; i < size / 2; i++) {
            sta.add(current.value);
            current = current.next;
        }


       if(size%2==0) {
        
        while(current!=null) {
            if(current.value!=sta.pop()) 
                return false;
            
            else 
                current=current.next;
            
        }
        return true;
       }

       else {

        current=current.next;

        while(current!=null) {
             if(current.value!=sta.pop()) 
                return false;
            
            else 
                current=current.next;

       }
       return true;
    }
   }
}
    

