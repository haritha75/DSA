import java.util.Arrays;

public class PriorityQueueWithArray {

     private int items[]=new int[5];
     private int count;


  
    public void enqueue(int item) {
        if(isFull())
          throw new IllegalStateException();

        int i=InsertTheItemsRightPosition(item);  

        items[i]=item;
        count++;

    }

    private int InsertTheItemsRightPosition(int item) {

        int i;
        for(i=count-1;i>=0;i--) {
            if(items[i]>item)
              items[i+1]=items[i];
            else 
              break;

        }

        return i+1;
    }


    public int dequeue() {
         if(isEmpty())
           throw new IllegalStateException();

         var front =items[--count];
         items[count]=0;

        return front; 

    }

    public int peek() {
        return items[count-1];
    }

    private boolean isEmpty() {
        return count==0;
    }


    private boolean isFull() {
        return count==items.length;

    }

    public int size() {
        return count;
    }

    public String toString() {

       return Arrays.toString(items);
    }
    
}