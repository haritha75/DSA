public class DoubleLinkedList {

    public static void main(String[] args) {
        
        DoubleLinkedList dl=new DoubleLinkedList();
        dl.add1(56);
        dl.add1(43);
        dl.add1(57);
        dl.add1(12);
        dl.add1(13);
        // dl.printNextNodes();
        // System.out.println();
        // dl.printUpNodes();

        // System.out.println(dl.head.value);
        // System.out.println(dl.search(56));

        System.out.println(dl.find(12));
        dl.minElement(dl.head);
        dl.maxElement(dl.head);
        System.out.println();
        dl.printIncrease(dl.head);
    }

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

        if(head==null) {
            head=node;
        }

        else {
            Node cur =head;

            while(cur.next!=null) {
                cur=cur.next;
            }
            cur.next=node;
        }
    }

    void addUp(int value) {
        Node node=new Node(value);

        if(head==null) {
            head=node;
        }

        else {
            Node cur=head;

            while(cur.up!=null) {
                cur=cur.up;
            }
            cur.up=node;
        }
    }

    void printNextNodes() {
        Node cur=head;

        while(cur!=null) {
            System.out.println(cur.value);
            cur=cur.next;
        }
    }

    void printUpNodes() {
        Node cur=head;

        while(cur!=null) {
            System.out.println(cur.value);
            cur=cur.up;
        }
    }

    void add(int value) {
        if(value<head.value)
            addUp(value);
        else 
           addNext(value);    
    }

    void add1(int value) {

        Node node=new Node(value);

        if(head==null){
            head=new Node(value);
            return;

        }

        Node current=head;

        while(current!=null) {

            if(current.value>value) {

                if(current.up==null) {

                    current.up=new Node(value);
                    return;

                }
                current=current.up;
            }
              else {

                if(current.next==null) {
                    current.next=new Node(value);
                    return;
                }

                current=current.next;
              
            }

        }    

       
    }

    public boolean search(int val) {

        if(head==null) 
           throw new IllegalStateException(); 

        if(head.value==val)
           return true;   
           
           Node current=head;

           while(current!=null) {

            if(current.value>val) {

              if(current.up!=null) {

                if(current.up.value==val) {
                    return  true;
                }

            }
            current=current.up;
                   
            }

            else {

                if(current.next!=null) {
                    if(current.next.value==val) {
                        return true;
                    }
                }
                current=current.next;

            }
           }

           return false;

    }

    public boolean find(int val) {
       
        Node current=head;

        while(current!=null) {

            if(current.value==val)
              return true;

            else if(current.value>val)
             current=current.up;
           else
             current=current.next;    
        }

        return false;

    }

    public void minElement(Node node) {

        if(node==null)
          return;

          if(node.up==null) {
            System.out.println(node.value);
            return;
          }

          minElement(node.up);
    }

     public void maxElement(Node node) {

        if(node==null)
          return;

          if(node.next==null) {
            System.out.println(node.value);
            return;
          }

          maxElement(node.next);
    }

    public void printIncrease(Node node) {

        if(node==null)
          return;

        printIncrease(node.up);  
        System.out.println(node.value);
        printIncrease(node.next);
    }

    public void printDecrease(Node node) {

        if(node==null)
          return;
        
        printDecrease(node.next);  
        System.out.println(node.value);
        printDecrease(node.up);

    }
}

    

