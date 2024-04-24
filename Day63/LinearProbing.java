import java.security.NoSuchAlgorithmException;
import java.util.NoSuchElementException;

public class LinearProbing {

    private class Entry {

        int key;
        String value;
        
        Entry(int key,String value) {

            this.key=key;
            this.value=value;
        }
        @Override

        public String toString() {
            return key +":"+ value;
        }
    }

    private Entry[] entries= new Entry[10];

    int len=entries.length;
    int count=0;
 
    public void put(int key,String value) {

        if(isFull())
          throw new StackOverflowError();

        var entry = new Entry(key, value);
        int index=hash(key);

        if(entries[index]!=null)
           entries[index].value=value; //if already given index exit then update the value
        else 
           entries[index]=entry;
       
        count++;         


    }

    public void remove(int key) {

        int index=hash(key);

         if(isEmpty(index))
           throw new NoSuchElementException();

         entries[index]=null;
         count--;  
            
    }

    private boolean isFull() {
        return len==count;
    }

    public int size() {
        return count;
    }

    private int hash(int key) {

        int index=key % len;

        int start = 0;

        while (entries[start]!=null && start < len) {

            if(entries[start].key == key) //here checking same key or not
                return start;
            start++;
        }

        while (entries[index]!=null)
            index = (index+1)%len; //we are checking if given index not null then go to next empty index and return it.

        return index;

    }

    public int getIndex(int key) {

        int index=key%len;

        if(entries[index]==null)
           return index;
        if(entries[index].key==key)
          return index;
          
        int start=0;
        
        while(start<len) {

            if(entries[start].key==key)
              return start;
            else 
                start++;  
        }
        return start;
    }

    public String get(int key) {

        int index=getIndex(key);

        if(entries[index]==null)
          throw new  NoSuchElementException();
           
        return entries[index].value;  

    }

    public boolean containsKey(int key) {

        int index=getIndex(key);

        if(entries[index]==null)
          return false;

        if(entries[index].key==key)
           return true;
        return false;   
    }

    public boolean containsValue(String value) {

        int index=0;

        while(index<len && entries[index]!=null) {

            if(entries[index].value==value)
              return true;
            else 
              index++;  
        }
        return false;


    }

    private boolean isEmpty(int index) {
        return entries[index]==null;
    }
    
}
