public class MainEx {

    public static void main(String[] args) {
        
        DoubleLinkedList dl=new DoubleLinkedList();
        dl.addLast(1);
        dl.addLast(2);
        dl.addLast(2);
        dl.addLast(1);
       // dl.printValues();
        // dl.printReverse();
        System.out.println(dl.size());

        // int arr[]={34,67,12,76,44};
        // dl.addManyAtLast(arr);
        //dl.addAt(1, 99);
        //dl.printValues();
        //System.out.println(dl.indexOf(33));
        //dl.lastIndexOf(22);
        // dl.printValues();
        // System.out.println(dl.indexOf(87));
        // System.out.println(dl.indexOf(33));
        // System.out.println(dl.indexOf(22));
        // System.out.println(dl.indexOf(43));

        // dl.reverse();
        // System.out.println();
        // dl.printValues();
        // System.out.println(dl.indexOf(87));
        // System.out.println(dl.indexOf(33));
        // System.out.println(dl.indexOf(22));
        // System.out.println(dl.indexOf(43));

        System.out.println(dl.isPalindrome());

    }
    
}
