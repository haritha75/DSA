import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.concurrent.ArrayBlockingQueue;

public class Stack1 {

    ArrayList<Integer> list = new ArrayList<>();

    public void push(int item) {

        list.add(item); //arraylist is a dynamic so their is no full stack because we can resize the automatically whenver size is full.
    }

    public int pop() {

        if(list.isEmpty())
          throw new EmptyStackException();
         var top=list.get(list.size()-1); //here we can take last element i mean top element in the arraylist.get method return the value of the index.
         list.remove(list.size()-1); //removing the top element
         return top;  

        
        }

    public int peek() {

        if(list.isEmpty())
           throw new EmptyStackException();
        return list.get(list.size()-1);   
    } 
    
    
    public boolean value(int value) {

        if(list.isEmpty())
           throw new EmptyStackException();
        return list.contains(value);  

    }

    public boolean findValue(int item) {

        if(list.isEmpty())
          throw new EmptyStackException();
        var top= list.size()-1;
        
        while(top>=0) {

            if(list.get(top)==item)
                return true;

            top--;
    
        }

        return false;
    }

    public void index(int item) {

        if(list.isEmpty())
           throw new EmptyStackException();
        var top = list.size()-1; 
        while(top>=0) {

            if(list.get(top)==item) {
                System.out.println(top);
                return;
            }
            top--;

        }
        
         System.out.println(-1);

    }
}