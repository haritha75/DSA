import java.util.Arrays;

public class MyArray {

    private int items[];

    public MyArray(int size) {
        items = new int[size];
    }

    private int count = 0;

    public void insert(int val) {


        if(items.length == count) {
            items = new int[count+1];
        }

        items[count++] = val;

    }
    public void removeAt(int index) {

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
        return indexOf(val)!=-1;

    }

    public int firstIndexOf(int val) {

        return indexOf(val);
    }

    public int lastIndexOf(int val) {

        for(int i=count-1;i>-1;i--)
            if(items[i]==val)
                return i;
        return -1;
    }

    int getIndex(int val) {
       return indexOf(val);
    }

    int getValue(int index) {
        if(index<0 || index>=count)
            throw new IllegalArgumentException("Invalid range");
        return items[index];
    }

    int x =0;
    boolean hasNext() {
        return x!=count;

    }
    int next() {
        return items[x++];

    }

    int[] toArray() {
       return Arrays.copyOf(items,count);
    }



    @Override
    public String toString() {

        return Arrays.toString(Arrays.copyOf(items,count));
    }

    public void trimToSize() {

        items=Arrays.copyOf(items,count);
    }

    void subList(int start,int end) {

       if(!validIndex(start,end))
            throw new IllegalArgumentException("Invalid range");

        int subList[]=Arrays.copyOfRange(items,start,end);
        System.out.println(Arrays.toString(subList));

    }
    boolean validIndex(int start,int end) {

        return (start>=0 && start<=count && end >=start && end <=count);
    }

    void sort() {

       Arrays.sort(items,0,count);
    }

    boolean isEmpty() {
        return count == 0;
    }

    void clear() {

        count = 0;
    }
    void set(int index,int val) {

        if(index<0 || index>=count)
            throw new IllegalArgumentException();
        items[index]=val;
    }

    void removeRange(int start,int end) {
       if(!validIndex(start,end))
           throw new IllegalArgumentException("Invalid range");
        int removeLen=end-start;

        for(int i=end;i<count;i++) {
            items[start++] = items[i];
        }
        count -= removeLen;
    }

    public int size() {
        return count;
    }

    public void print() {


        for(int i=0;i<count;i++)
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
        Arrays.sort(items);
        System.out.println(items[count-1]);
    }

    void min() {
        Arrays.sort(items);
        System.out.println(items[0]);
    }

    void printMiddile() {

        if(count%2==0)
            System.out.println(items[(count/2)-1]+" "+items[count/2]);

        else

            System.out.println(items[count/2]);

    }
    void insertAt(int ind,int val) {

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

       int i= items.length;
       while(i<cap)
           i*=2;

       items=new int[i];

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

