import java.util.LinkedList;

public class LinkedListFunctions {


    public static void main(String[] args) {
        
        LinkedList<Integer> li = new LinkedList<>();

        li.add(23);
        li.add(89);
        li.add(40);
        li.add(22);
        li.add(23);

        li.addFirst(44);
        li.addLast(90);

        System.out.println(li);
       


        li.remove(3);
        li.removeFirst();
        li.removeLast();

        System.out.println();

        System.out.println(li);
       li.removeFirstOccurrence(23);
       li.removeLastOccurrence(89);
       System.out.println(li.size());
       System.out.println(li.indexOf(22));
       System.out.println(li.contains(22));

       System.out.println(li);
       li.clear();
       System.out.println(li);
    }
    
}
