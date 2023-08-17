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
    }
    
}
