public class MyArray {

    private int items[];

    public MyArray(int size) {
        items = new int[size];
    }

    private int count = 0;

    public void insert(int val) {

        if(items.length==count) { //here we are checking whether array is full or not

            int item[]=new int[count*2]; //if array full then we are resize the array
            for(int i=0;i<count;i++) {
              item[i]=items[i]; //all values copying into the new array
            }
            items=item; //items pointing to the item then items array previous values atomatically removed.

        }

        items[count++]=val;

    }
    public void removeAt(int index) {

        //validation
        if(index<0 || index>=count)
          throw new IllegalArgumentException();

        for(int i=index;i<count;i++) {
          items[i]=items[i+1];
        }

        count--;     
          
    }


    public int indexOf(int val) {
        for(int i=0;i<count;i++) {
            if(items[i]==val)
              return i;
        }
        return -1;

    }
    boolean contains(int val) {
         for(int i=0;i<count;i++) {
            if(items[i]==val)
              return true;;
        }
        return false;


    }

    public int firstIndexOf(int val) {

        for(int i=0;i<count;i++) 
           if(items[i]==val)
           return i;
        return -1;   
    }

    public int lastIndexOf(int val) {

        for(int i=count-1;i>-1;i--) 
           if(items[i]==val)
           return i;
        return -1;   
    }



    public void print() {


        for(int i=0;i<count;i++) //here we are using count because if you use length then default values prinitng zeros if you do  want to that then how many items we are insert then count them use here count and priting only inserting elements.
           System.out.println(items[i]);
    }

    public int size() {
        return count;
    }
}