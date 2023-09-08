public class DoubleLinkedList {

    public static void main(String[] args) {
        
        DoubleLinkedList dl=new DoubleLinkedList();
        dl.addNext(54);
        dl.add1(56);
        dl.add1(43);
        dl.add(57);
        dl.add(12);
        dl.add(13);
        dl.printNextNodes();
        System.out.println();
        dl.printUpNodes();

        System.out.println(dl.head.value);
        System.out.println(dl.search(56));
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
            addNext(value);
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
}

    

