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

//     public void rightSlot(int value) {
//         Node node=new Node(value);

//         if(head==null) {
//           head=node;
//           node.next=node;
//         }
//         else if(head==head.next) {
//             if(head.value>node.value) 
//                addFirstOptimized(value);
//             else 
//                 addLastOPtimized(value);   
//         }
//         else {
//             Node current=head;

//             if(current.value>=value) {

//                 int temp=current.value;
//                 current.value=node.value;
//                 node.value=temp;
//                 node.next=current.next;
//                 current.next=node;

//             }
//             else if(current.value<value&&current.next.value>value){
                
//                 node.next=current.next;
//                 current.next=node;
                

//             }

//             // else  {
//             //     addLastOPtimized(value);

//             // }
//             current=current.next;
             
//             addLastOPtimized(value);


//         }

//     }

 }