import java.util.Arrays;

public class MainArray {

    public static void main(String[] args) {
        

        MyArray myArray = new MyArray(3);

        myArray.insert(2);
        myArray.insert(1);
        myArray.insert(0);
        myArray.insert(5);
        myArray.insert(7);
        myArray.removeAt(2);
        myArray.print();
        System.out.println(myArray.size());
        System.out.println( myArray.contains(5));
        System.out.println(myArray.firstIndexOf(1));


        // while(myArray.hasNext()) {
        //     System.out.println(myArray.next());
        // }

        // int items[]= myArray.toArray();
        // System.out.println(Arrays.toString(items));



        myArray.subList(0,3);

        myArray.sort();
        System.out.println(myArray);
        System.out.println(myArray.isEmpty());
        myArray.clear();
        myArray.print();
        System.out.println(myArray);
        
    }
    
}
