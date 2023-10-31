import java.util.HashSet;

public class LinkedList {

    public static void main(String[] args) {

        LinkedList list=new LinkedList();


        Node node =new Node(11);
        node.adderess=new Node(43);
        node.adderess.adderess=new Node(11);

        list.print(node);
        list.removeDup(node);
        System.out.println();
        list.print(node);

    }

    static class Node {

        int value;
        Node adderess;

        Node (int value) {
            this.value=value;
        }

    }
   
    public void print(Node head) {

         Node cur=head;

         while(cur!=null) {
            System.out.println(cur.value);
            cur=cur.adderess;
         }

    }

   

    public void removeDup(Node head) {

        HashSet<Integer> set=new HashSet<>();

        Node curr=head;
        Node previous=null;

        while(curr!=null) {

            if(set.contains(curr.value)) {
              previous.adderess=curr.adderess;
            }
            else {
              set.add(curr.value);
              previous=curr;
              
            }
            curr=curr.adderess;
        }


    }
    
}
