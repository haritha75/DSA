import java.util.ArrayDeque;
import java.util.Deque;

public class SlideWindowSubArrayMax {

    public static void main(String[] args) {

        int a[]={1,5,6,3,8};
        int k=3;
        subArrayMax(a,k);

        
    }

    public static void subArrayMax(int a[],int k) {

        Deque<Integer> deque=new ArrayDeque<>();

        for(int i=0;i<k;i++) {

            while(deque.size()>0 && a[i] >= a[deque.peekLast()]) 
               deque.pollLast();
            deque.offerLast(i);   
        }

        for(int i=k;i<a.length;i++) {

            System.out.print(a[deque.peekFirst()]+" ");

            while(deque.size()>0 && deque.peekFirst()<= i-k) 
                deque.pollFirst();

            while(deque.size()>0 && a[i] >= a[deque.peekLast()]) 
               deque.pollLast();
            deque.offerLast(i); 
        
            
        }
        System.out.println(a[deque.peekFirst()]);
    }
}