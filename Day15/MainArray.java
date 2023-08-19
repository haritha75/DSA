import java.util.Arrays;

public class MainArray {

    public static void main(String[] args) {
        

        MyArray myArray = new MyArray(10);

        myArray.insert(2);
        myArray.insert(199);
        myArray.insert(0);
        myArray.insert(577);
        myArray.insert(7);

        myArray.print();
        System.out.println();
        //myArray.removeRange(1,4);
        //myArray.print();
        // myArray.removeIfGreaterThan(3);
        // myArray.print();
         //System.out.println(); 
         //myArray.removeIfLessThan(2);
         //myArray.print();

        //myArray.removeEqualTo(2);
        //myArray.print();

        // myArray.reverse();
        // System.out.println();

        // myArray.max();
        // myArray.min();
        // myArray.printMiddile();
        //myArray.getItemsOfLength(1);

       // myArray.insertAt(1,4);
        //myArray.print();
        //System.out.println();



        // myArray.removeAt(2);
        // myArray.print();
        // System.out.println(myArray.size());
        // System.out.println( myArray.contains(5));
        // System.out.println(myArray.firstIndexOf(1));
       


        // while(myArray.hasNext()) {
        //     System.out.println(myArray.next());
        // }

        // int items[]= myArray.toArray();
        // System.out.println(Arrays.toString(items));



        // myArray.subList(0,3);

        // myArray.sort();
        // System.out.println(myArray);
        // System.out.println(myArray.isEmpty());
        // myArray.clear();
        // myArray.print();
        // System.out.println(myArray);
      // myArray.ensureCapacity(300);
       //myArray.print();

       //myArray.getItemsOfLength(1);
       int a[]={4,2,1,0};
       myArray.intersection(a);
    
         

       
        MyList list = new MyList<>(); //if not mention particular one then it takes all type values.
        list.add(70);
        list.add(5.4f);
        list.add("hello");

        list.printMan();

        
        
    }
    
}
class MyList<T> {

    Object item[]=new Object[5]; //it takes any type because it is parent class
    int count =0;
    void add(T val) {
        item[count++]=val;
    }
    void printMan() {
        System.out.println(Arrays.toString(item));
    }

}