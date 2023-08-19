import java.util.Arrays;

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
 
    int x =0;
    boolean hasNext() {
        return x!=count;

    }
    int next() {
        return items[x++];

    }

    int[] toArray() {
        int temp[]=new int[count];
        for(int i=0;i<count;i++) {
            temp[i]=items[i];
        }
        return temp;
    }
    


    @Override
    public String toString() {

        int item[] = Arrays.copyOf(items,count);
        return Arrays.toString(item);
    }

    public void trimToSize() {
        int[] newItems = new int[count];
        for(int i=0;i<count;i++)
          newItems[i]=items[i];
        
        items=newItems;  
    }

    void subList(int start,int end) {
        //validation
        if(start<0 || start >=count)
          throw new IllegalArgumentException();
        else if(!(end>=start&&end<=count))  //end<=srart && end>=count
           throw new IllegalArgumentException();
        if(start==end) {
            System.out.println("[]");
            return;
        }   


        int items1[] = new int[end-start];

        for(int i=start,j=0;i<end;i++)
            items1[j++]=items[i];
        System.out.println(Arrays.toString(items1));    

    }

    void sort() {

        int items1[] = Arrays.copyOf(items,count);
        Arrays.sort(items1);

        for(int i=0;i<count;i++)
           items[i]=items1[i]; //here, we are swap the items1 elements to items.

    }

    boolean isEmpty() {
        return count == 0;
    }

    void clear() {

         count = 0;
    }
    void set(int index,int val) {
        //validation 
        if(index<0 || index>=count)
          throw new IllegalArgumentException();
        items[index]=val;  
    }

    void removeRange(int start,int end) {
        //validation

        if(start<0||start>=count)
          throw new IllegalArgumentException();
        else if(end<start|| end>=count)
           throw new IllegalArgumentException();
        int removelen=end-start;
        
        for(int i=end;i<count;i++) {
            items[start++] = items[i];
        }
        count -= removelen;
    }

    public int size() {
        return count;
    }

     public void print() {


        for(int i=0;i<count;i++) //here we are using count because if you use length then default values prinitng zeros if you do  want to that then how many items we are insert then count them use here count and priting only inserting elements.
           System.out.print(items[i]+" ");
    }

    void removeIfGreaterThan(int val) {

         int aCount=0;
         for(int i=0;i<count;i++) {
            if(items[i]>val) {
                aCount++;
            }
         }

        int a[]=new int[count-aCount];
        for(int i=0,j=0;i<count;i++) {
            if(items[i]>val) {     
                
            }
            else {
                a[j++]=items[i];
            }
        }
        items=a;
        count -=aCount;
    }

    void removeIfLessThan(int val) {
        int aCount=0;
         for(int i=0;i<count;i++) {
            if(items[i]<val) {
                aCount++;
            }
         }

        int a[]=new int[count-aCount];
        for(int i=0,j=0;i<count;i++) {
            if(items[i]<val) {     
                
            }
            else {
                a[j++]=items[i];
            }
        }
        items=a;
        count -=aCount;
       

    }
    void removeEqualTo(int val) {
        int aCount=0;
        for(int i=0;i<count;i++) {
            if(items[i]==val) {
                aCount++;
            }
        }
        int a[]=new int[count-aCount];
         for(int i=0,j=0;i<count;i++) {
            if(items[i]==val) {     
                
            }
            else {
                a[j++]=items[i];
            }
            
        }
        
        items=a;
        count -=aCount; 

    }
    void reverse() {
        for(int i=count-1;i>-1;i--) {
            System.out.print(items[i]);
        }
    }

    void max() {
        int max=-1;
        for(int i=0;i<count;i++) {
            if(items[i]>max)
              max=items[i];
        }
        System.out.println(max);
    }

    void min() {
        int min=items[0];
        for(int i=0;i<count;i++) {
            if(items[i]<min)
              min=items[i];
        }
        System.out.println(min);
    }

    void printMiddile() {

        if(count%2==0)
            System.out.println(items[(count/2)-1]+" "+items[count/2]);

        else 
        
             System.out.println(items[count/2]);

    }
    void insertAt(int ind,int val) {
        //validation
        count= count+1;
        int a[]=new int[count];
        if(ind<0 || ind>count)
          throw new IllegalArgumentException();
        
        for(int i=0,j=0;i<a.length;i++) {
            if(i==ind)
              a[i]=val;
            else 
             a[i]=items[j++];  

        }
        items=a;

    }
    void getItemsOfLength(int val) {
        
        for(int i=0;i<count;i++) {
            String s= String.valueOf(items[i]);
            if(s.length()==val) {
                System.out.print(items[i]+" ");
            }
            
        }
        
    }
   
    void ensureCapacity(int cap) {
       
        int data[]=new int[cap];
        for(int i=0;i<items.length;i++) {
            data[i]=items[i];
        }
        System.out.println(items.length);
        items=data;
        System.out.println(items.length);

       }

       void intersection(int a[]) {

        for(int i=0;i<a.length;i++) {
            for(int j=0;j<count;j++) {
                if(a[i]==items[j]) {
                    System.out.print(items[j]+" ");
                    break;
                }
            }
        }
       }
        
    }

   
